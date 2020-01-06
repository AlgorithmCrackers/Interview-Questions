/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
const twoSum = function(nums, target) {
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
