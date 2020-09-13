/*
 * @lc app=leetcode.cn id=91 lang=java
 *
 * [91] 解码方法
 *
 * https://leetcode-cn.com/problems/decode-ways/description/
 *
 * algorithms
 * Medium (24.11%)
 * Likes:    497
 * Dislikes: 0
 * Total Accepted:    67K
 * Total Submissions: 274.1K
 * Testcase Example:  '"12"'
 *
 * 一条包含字母 A-Z 的消息通过以下方式进行了编码：
 * 
 * 'A' -> 1
 * 'B' -> 2
 * ...
 * 'Z' -> 26
 * 
 * 
 * 给定一个只包含数字的非空字符串，请计算解码方法的总数。
 * 
 * 示例 1:
 * 
 * 输入: "12"
 * 输出: 2
 * 解释: 它可以解码为 "AB"（1 2）或者 "L"（12）。
 * 
 * 
 * 示例 2:
 * 
 * 输入: "226"
 * 输出: 3
 * 解释: 它可以解码为 "BZ" (2 26), "VF" (22 6), 或者 "BBF" (2 2 6) 。
 * 
 * 
 */

// @lc code=start

    class Solution {
    //dp[i]: s.subString(i)有多少种
    private int[] dp;

    public int numDecodings(String s) {
        dp = new int[s.length()];
        char last = s.charAt(s.length() - 1);
        dp[s.length() - 1] = last != '0' ? 1 : 0;
        for (int index = s.length() - 2; index >= 0; index--) {
            char curr = s.charAt(index);
            if (curr == '0') {
                dp[index] = 0;
            } else if (curr >= '3') {
                dp[index] = dp[index + 1];
            } else {
                //c=1或2
                char next = s.charAt(index + 1);
                //aka dp[index+2]. fail safe.
                int dp2 = index + 2 >= s.length() ? 1 : dp[index + 2];
                if (next == '0') {
                    dp[index] = dp2;
                } else if (next <= '6') {
                    dp[index] = dp[index + 1] + dp2;
                } else {
                    //c=1或2，但next>=7
                    if (curr == '1') {
                        dp[index] = dp[index + 1] + dp2;
                    } else {
                        //c=2,next>7
                        dp[index] = dp[index + 1];
                    }
                }
            }
        }
        return dp[0];
    }
}


// @lc code=end

