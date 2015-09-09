class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        negative = False
        #check for negation
        if x < 0: 
            negative = True
            x = x * -1
        str_x = str(x)
        reversed_str = self.reverseString(str_x)
        if(negative):
            reversed_str = "-" + reversed_str
        result = int(reversed_str)
        if result > 2147483647 or result < -2147483647:
            return 0
        else:
            return result

    def reverseString(self, str):
        l = len(str)
        mid = l/2
        low = 0
        high = l-1
        list_x = list(str)
        for i in range(mid):
            temp = list_x[low]
            list_x[low] = list_x[high]
            list_x[high] = temp
            low += 1
            high -= 1
        return ''.join(list_x)

def main():
    print Solution().reverse(1534236469)
if __name__ == "__main__":
    main()
        
        
        