import java.sql.Array;
import java.util.Arrays;

import jdk.nashorn.internal.ir.Flags;

/*
 * @lc app=leetcode.cn id=242 lang=java
 *
 * [242] 有效的字母异位词
 *
 * https://leetcode-cn.com/problems/valid-anagram/description/
 *
 * algorithms
 * Easy (60.46%)
 * Likes:    216
 * Dislikes: 0
 * Total Accepted:    115.8K
 * Total Submissions: 191.3K
 * Testcase Example:  '"anagram"\n"nagaram"'
 *
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 * 
 * 示例 1:
 * 
 * 输入: s = "anagram", t = "nagaram"
 * 输出: true
 * 
 * 
 * 示例 2:
 * 
 * 输入: s = "rat", t = "car"
 * 输出: false
 * 
 * 说明:
 * 你可以假设字符串只包含小写字母。
 * 
 * 进阶:
 * 如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？
 * 
 */

// @lc code=start
class Solution {
    public boolean isAnagram(String s, String t) {
        // // 解法一 排序 时间复杂度：O(n \log n)O(nlogn) 空间复杂度：O(1)O(1)
        // if (s.length() != t.length())
        // return false;
        // char[] s1 = s.toCharArray();
        // char[] t1 = t.toCharArray();
        // Arrays.sort(s1);
        // Arrays.sort(t1);
        // return Arrays.equals(s1, t1);
        // // 解法二 哈希表
        // if (s.length() != t.length()) {
        // return false;
        // }
        // int[] counter = new int[26];
        // for (int i = 0; i < s.length(); i++) {
        // counter[s.charAt(i) - 'a']++;
        // counter[t.charAt(i) - 'a']--;
        // }
        // for (int i : counter) {
        // if (i != 0)
        // return false;
        // }
        // return true;
        // 解法三 哈希二 时间复杂度：O(n) 空间复杂度：O(1)
        if (s.length() != t.length())
            return false;
        int[] table = new int[26];
        for (int i = 0; i < s.length(); i++) {
            table[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            table[t.charAt(i) - 'a']--;
            if (table[t.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
// @lc code=end
