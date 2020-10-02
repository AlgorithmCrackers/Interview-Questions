// two pass hashmap solution
const twoSum2 = function(nums, target) {
    const cache = {}
    // put a map of <value, index>
    nums.forEach((value, index) => {
        cache[value] = index
    })
    // iterate through array and check if we had the needed value in the hashmap
    for (let i=0; i< nums.length; i++) {
        const needed = target - nums[i]
        // initial check is to see if we dont use the same number
        if (needed in cache) {
            const j = cache[needed]
            if (i !== j) return [i, j]
        }
    }
    return []
};

// 1 pass hashmap solution
var twoSum = function(nums, target) {
    // put a map of <value, index>
    const cache = {}
    // iterate through array and check if we had the needed value in the hashmap
    for (let i=0; i< nums.length; i++) {
        const needed = target - nums[i]
        if (needed in cache) {
            const j = cache[needed]
            return [i, j]
        }
        cache[nums[i]] = i
    }
    return []
};
