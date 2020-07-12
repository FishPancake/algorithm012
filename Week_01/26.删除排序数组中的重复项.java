/*
 * @lc app=leetcode.cn id=26 lang=java
 *
 * [26] 删除排序数组中的重复项
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null)
            return 0;
        if (nums.length < 2)
            return nums.length;
        int m = 0;
        for (int n = 1; n < nums.length; n++) {
            if (nums[n] != nums[m]) {
                nums[++m] = nums[n];
            }
        }
        return m + 1;
    }
}
// @lc code=end
