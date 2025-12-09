/**
 * @param {number[]} nums
 * @param {(accum: number, curr: number) => number} fn
 * @param {number} init
 * @return {number}
 */
function reduce(nums, fn, init) {
  let acc = init;
  for (let i = 0; i < nums.length; i++) {
    acc = fn(acc, nums[i]);
  }
  return acc;
}
