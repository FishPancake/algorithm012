import java.util.Arrays;
import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=350 lang=java
 *
 * [350] 两个数组的交集 II
 *
 * https://leetcode-cn.com/problems/intersection-of-two-arrays-ii/description/
 *
 * algorithms
 * Easy (49.03%)
 * Likes:    347
 * Dislikes: 0
 * Total Accepted:    119.2K
 * Total Submissions: 231.4K
 * Testcase Example:  '[1,2,2,1]\n[2,2]'
 *
 * 给定两个数组，编写一个函数来计算它们的交集。
 * 
 * 
 * 
 * 示例 1：
 * 
 * 输入：nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出：[2,2]
 * 
 * 
 * 示例 2:
 * 
 * 输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出：[4,9]
 * 
 * 
 * 
 * 说明：
 * 
 * 
 * 输出结果中每个元素出现的次数，应与元素在两个数组中出现次数的最小值一致。
 * 我们可以不考虑输出结果的顺序。
 * 
 * 
 * 进阶：
 * 
 * 
 * 如果给定的数组已经排好序呢？你将如何优化你的算法？
 * 如果 nums1 的大小比 nums2 小很多，哪种方法更优？
 * 如果 nums2 的元素存储在磁盘上，磁盘内存是有限的，并且你不能一次加载所有的元素到内存中，你该怎么办？
 * 
 * 
 */

// @lc code=start

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        // // 解法一 哈希 时间O(nums1.length+num2.length) 空间O(min(m,n))
        // if (nums1.length > nums2.length)
        // intersect(nums2, nums1);
        // HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        // for (int i : nums1) {
        // int count = map.getOrDefault(i, 0) + 1;
        // map.put(i, count);
        // }
        // int[] intersection = new int[nums1.length];
        // int index = 0;
        // for (int i : nums2) {
        // int count = map.getOrDefault(i, 0);
        // if (count > 0) {
        // intersection[index++] = i;
        // count--;
        // if (count > 0) {
        // map.put(i, count);
        // } else {
        // map.remove(i);
        // }
        // }
        // }
        // return Arrays.copyOfRange(intersection, 0, index);
        // 解法二 排序+双指针 时间 O(mlogm+nlogn) 空间O(min(m,n))
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0, k = 0;
        int[] intersection = new int[Math.min(nums1.length, nums2.length)];
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] > nums2[j]) {
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                intersection[k] = nums1[i];
                k++;
                j++;
                i++;
            }
        }
        return Arrays.copyOfRange(intersection, 0, k);
    }
}
// @lc code=end
