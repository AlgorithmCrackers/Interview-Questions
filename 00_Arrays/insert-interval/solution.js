/**
 * @param {number[][]} intervals
 * @param {number[]} newInterval
 * @return {number[][]}
 */

var insert = function(intervals, newInterval) {
    const result = []
    let i = 0
    // add all the intervals ending before merging-interval starts
    while (i < intervals.length && newInterval[0] > intervals[i][1]) {
        result.push(intervals[i])
        i++
    }
    let startRes = newInterval[0]
    let endRes = newInterval[1]
    // merge all overlapping intervals to one considering merging-interval
    while (i < intervals.length && newInterval[1] >= intervals[i][0]) {
        startRes = Math.min(startRes, intervals[i][0])
        endRes = Math.max(endRes, intervals[i][1])
        i++
    }
    // merge the newly created merging-interval
    result.push([startRes, endRes])
    // push the rest
    while (i < intervals.length) {
        result.push(intervals[i])
        i++
    }
    return result
};
