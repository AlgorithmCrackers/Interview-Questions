/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isAnagram = function (s, t) {
  if (s.length != t.length) {
    return false;
  }
  const aCharCode = "a".charCodeAt(0);
  // every char is "a" to "z" so assume its 26, initialse with 0s
  const table = Array.from(Array(26), () => 0);
  for (let i = 0; i < s.length; i++) {
    // charCode - charCode gives a value between 0-25
    table[s.charCodeAt(i) - aCharCode]++;
    table[t.charCodeAt(i) - aCharCode]--;
  }
  // every number in the table must be exactly zero, only then its an anagram
  return table.every((count) => count === 0);
};

// Hashmap solution
var isAnagram = function (s, t) {
  if (s.length != t.length) {
    return false;
  }
  const map = new Map();
  for (let i = 0; i < s.length; i++) {
    const char = s[i];
    const prevCount = map.get(char) ?? 0;
    map.set(char, prevCount + 1);
  }
  for (let i = 0; i < t.length; i++) {
    const char = t[i];
    const prevCount = map.get(char) ?? 0;
    // when 0, the character is not present in the previous string
    // or there is extra in this string
    // so when 0, its not an anagram
    if (prevCount === 0) return false;
    map.set(char, prevCount - 1);
  }
  return true;
};
