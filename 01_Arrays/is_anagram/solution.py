class Solution(object):
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        sLen = len(s)
        tLen = len(t)
        if sLen != tLen:
            return False
        dict = {}
        for i in range(sLen):
            if s[i] in dict:
                dict[s[i]] += 1
            else:
                dict[s[i]] = 1
        
        for i in range(tLen):
            if t[i] not in dict:
                return False
            else:
                if dict[t[i]] == 1:
                    del dict[t[i]]
                else:
                    dict[t[i]] -= 1
        if any(dict):
            # dict is not empty
            return False
        return True

    def isAnagram_2(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        sLen = len(s)
        tLen = len(t)
        if sLen != tLen:
            return False
        char_count = [0] * 26
        for i in range(sLen):
            char_count[ord(s[i]) - ord('a')] += 1
        print char_count
        for j in range(tLen):
            char_count[ord(t[j]) - ord('a')] -= 1
        for k in range(sLen):
            if char_count[k] != 0:
                return False
        return True

    # O(nlog n) for sorting(which is internal)
    # O(1) space

    def isAnagram_3(self, s, t):
        sLen = len(s)
        tLen = len(t)
        if sLen != tLen:
            return False
        s = sorted(s)
        t = sorted(t)
        for i in range(sLen):
            if s[i] != t[i]:
                return False
        return True

    # O(n) time, O(1) space
     def isAnagram_4(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        while s != '':
            if len(s) != len(t):
                return False
            tmp = s[0]
            s = s.replace(tmp, '')
            try:
                t = t.replace(tmp, '')
            except:
                return False

        if t != '':
            return False
        else:
            return True

        
def main():
    pgm = Solution();
    print pgm.isAnagram_3("zaamh", "mahaz")
if __name__ == '__main__':
    main()