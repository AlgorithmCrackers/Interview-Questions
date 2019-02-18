class Solution {
    fun firstUniqChar(s: String): Int {
        // there are only lowercase letters so make an array of size 26 for a-z
        val charCount = IntArray(26)
        // 'a' - 'a' = 0 ... 'z' - 'a' = 25
        // so we can make use of that to get the index of the character in the array
        // now populate the array with the count
        for (i in 0 until s.length)
            charCount[s[i] - 'a']++
        
        // iterate the string again now
        // check for count in the array, if the count is exacly 1 then it is non-repeating
        for (i in 0 until s.length)
            if (charCount[s[i] - 'a'] == 1)
                return i
        return -1
    }
    
    fun firstUniqCharWithMap(s: String): Int {
        // the map holds the character as its key
        // the value is the amount of times that the character has occured in the string
        val map = HashMap<Char, Int>()
        // itreate over the string and build the map
        for (index in s.indices) {
            val character = s[index]
            val count = map.get(character) ?: 0
            map.put(character, count + 1)
        }
        // iterate over the string
        for (index in s.indices) {
            val character = s[index]
            val count = map.get(character)!!
            // if the count was exactly 1, then it was non repeating/unique
            if (count == 1) return index
        }
        return -1
    }
}
