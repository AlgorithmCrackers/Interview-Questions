class Solution(object):
    # @input inp_ele int
    # arr array
    def changeMakerHelper(self, inp_ele, arr, res_arr, index):
        #base case
        if index > len(arr):
            return
        if inp_ele == 0:
            return
        
        
        if inp_ele >= arr[index]: # 26 >= 25
            res_arr.append(arr[index])
            self.changeMakerHelper(inp_ele - arr[index], arr, res_arr, index)
        else: 
            # increment the index and check recursively
             self.changeMakerHelper(inp_ele, arr, res_arr, index + 1)
    
    def changeMaker(self, inp_ele, arr):
        arr = sorted(arr,reverse = True)
        res_arr = []
        self.changeMakerHelper(inp_ele, arr, res_arr, 0)
        print res_arr

    def changeMakerNewHelper(self, inp_ele, arr, res_arr, index):
        temp_list = [x for x in arr if x >= (inp_ele/2)]
        for item in temp_list:
            if inp_ele % item == 0:
                # res = [item] * (inp_ele / item)
                for i in range(inp_ele / item):
                    res_arr.append(item)
                return;
        if index > len(arr):
            return
        if inp_ele == 0:
            return
        
        
        if inp_ele >= arr[index]: # 26 >= 25
            res_arr.append(arr[index])
            self.changeMakerHelper(inp_ele - arr[index], arr, res_arr, index)
        else: 
            # increment the index and check recursively
             self.changeMakerHelper(inp_ele, arr, res_arr, index + 1)
        
        
            
        

    def changeMakerNew(self, inp_ele, arr = [10, 25, 1, 5]):
        arr = sorted(arr,reverse = True)
        res = []
        self.changeMakerNewHelper(inp_ele, arr, res, 0)
        print res
        
        
pgm = Solution()
pgm.changeMakerNew(26)
pgm.changeMakerNew(24)
pgm.changeMakerNew(49)
# ChangeMaker.makeChange(26, new int[] {10, 25, 1, 5}) => [25, 1]
# ChangeMaker.makeChange(14, new int[] {10, 7, 1}) 
pgm.changeMakerNew(26, [10, 25, 1, 5])
pgm.changeMakerNew(14, [10, 7, 1])