/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    let minSoFar = Number.MAX_SAFE_INTEGER
    let maxProfit = 0;
    prices.forEach((value) => {
        if (value < minSoFar) {
            minSoFar = value
        } else {
            const profit = value - minSoFar
            maxProfit = Math.max(maxProfit, profit)
        }
    })
    return maxProfit;
};
