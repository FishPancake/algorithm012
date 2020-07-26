/*
 * @lc app=leetcode.cn id=50 lang=java
 *
 * [50] Pow(x, n)
 *
 * https://leetcode-cn.com/problems/powx-n/description/
 *
 * algorithms
 * Medium (36.10%)
 * Likes:    453
 * Dislikes: 0
 * Total Accepted:    110.8K
 * Total Submissions: 306.5K
 * Testcase Example:  '2.00000\n10'
 *
 * 实现 pow(x, n) ，即计算 x 的 n 次幂函数。
 * 
 * 示例 1:
 * 
 * 输入: 2.00000, 10
 * 输出: 1024.00000
 * 
 * 
 * 示例 2:
 * 
 * 输入: 2.10000, 3
 * 输出: 9.26100
 * 
 * 
 * 示例 3:
 * 
 * 输入: 2.00000, -2
 * 输出: 0.25000
 * 解释: 2^-2 = 1/2^2 = 1/4 = 0.25
 * 
 * 说明:
 * 
 * 
 * -100.0 < x < 100.0
 * n 是 32 位有符号整数，其数值范围是 [−2^31, 2^31 − 1] 。
 * 
 * 
 */

// @lc code=start
class Solution {
    public double myPow(double x, int n) {
        long n1 = n;
        return n1>=0?quickMul(x,n1):1.0/quickMul(x,-n1);
    }
    // 解法一 快速幂+递归
    // 时间复杂度：O(logn)，即为递归的层数。
    // 空间复杂度：O(logn)，即为递归的层数。这是由于递归的函数调用会使用栈空间。

    // public double quickMul(double x,long n){
    //     if(n==0)return 1.0;
    //     double y=quickMul(x,n/2);
    //     return n%2==0?y*y:y*y*x;
    // }
    // 方法二：快速幂 + 迭代
    // 时间复杂度：O(logn)，即为对 nn 进行二进制拆分的时间复杂度。

    // 空间复杂度：O(1)。
    public double quickMul(double x, long N) {
        double ans = 1.0;
        // 贡献的初始值为 x
        double x_contribute = x;
        // 在对 N 进行二进制拆分的同时计算答案
        while (N > 0) {
            if (N % 2 == 1) {
                // 如果 N 二进制表示的最低位为 1，那么需要计入贡献
                ans *= x_contribute;
            }
            // 将贡献不断地平方
            x_contribute *= x_contribute;
            // 舍弃 N 二进制表示的最低位，这样我们每次只要判断最低位即可
            N /= 2;
        }
        return ans;
    }


}
// @lc code=end

