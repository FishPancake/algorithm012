import java.util.*;

/*
 * @lc app=leetcode.cn id=49 lang=java
 *
 * [49] 字母异位词分组
 *
 * https://leetcode-cn.com/problems/group-anagrams/description/
 *
 * algorithms
 * Medium (62.35%)
 * Likes:    388
 * Dislikes: 0
 * Total Accepted:    87.4K
 * Total Submissions: 139.8K
 * Testcase Example:  '["eat","tea","tan","ate","nat","bat"]'
 *
 * 给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。
 * 
 * 示例:
 * 
 * 输入: ["eat", "tea", "tan", "ate", "nat", "bat"]
 * 输出:
 * [
 * ⁠ ["ate","eat","tea"], 
 * ⁠ ["nat","tan"],
 * ⁠ ["bat"]
 * ]
 * 
 * 说明：
 *  
 * 
 * 所有输入均为小写字母。
 * 不考虑答案输出的顺序。
 * 
 * 
 */

// @lc code=start
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // 方法一 排序数组分类
        // 时间复杂度：O(NK log K)，其中 NN 是 strs 的长度，而 KK 是 strs
        // 中字符串的最大长度。当我们遍历每个字符串时，外部循环具有的复杂度为 O(N)O(N)。然后，我们在 O(K \log K)O(KlogK)
        // 的时间内对每个字符串排序。
        // 空间复杂度：O(NK)，排序存储在 ans 中的全部信息内容。
        // if (strs.length == 0)
        // return new ArrayList<>();
        // Map<String, ArrayList> ans = new HashMap<String, ArrayList>();
        // for (String s : strs) {
        // char[] c = s.toCharArray();
        // Arrays.sort(c);
        // String key = String.valueOf(c);
        // if (!ans.containsKey(key))
        // ans.put(key, new ArrayList());
        // ans.get(key).add(s);
        // }
        // return new ArrayList(ans.values());

        // 方法二 按计数分类
        // 时间复杂度：O(NK)，其中 NN 是 strs 的长度，而 KK 是 strs
        // 中字符串的最大长度。计算每个字符串的字符串大小是线性的，我们统计每个字符串。
        // 空间复杂度：O(NK)，排序存储在 ans 中的全部信息内容。
        if (strs.length == 0)
            return new ArrayList<>();
        Map<String, List> ans = new HashMap<>();
        int[] count = new int[26];
        for (String s : strs) {
            Arrays.fill(count, 0);
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < count.length; i++) {
                sb.append('#');
                sb.append(count[i]);
            }
            String key = sb.toString();
            if (!ans.containsKey(key))
                ans.put(key, new ArrayList<>());
            ans.get(key).add(s);
        }
        return new ArrayList(ans.values());
    }
}
// @lc code=end
