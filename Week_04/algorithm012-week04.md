# 深度优先搜索和广度优先搜索

## 示例代码

### python

```python
class TreeNode: 
def __init__(self, val): 
 self.val = val 
 self.left, self.right = None, None
```
### c++
```c++
struct TreeNode { 
int val; 
 TreeNode *left; 
 TreeNode *right; 
 TreeNode(int x) : val(x), left(NULL), right(NULL) {} 
}
```
### java
```java
public class TreeNode {
public int val;
public TreeNode left, right;
public TreeNode(int val) {
this.val = val;
this.left = null;
this.right = null; } }
```



## 搜索 - 遍历

• 每个节点都要访问一次

• 每个节点仅仅要访问一次

• 对于节点的访问顺序不限 

\- 深度优先：depth first search 

\- 广度优先：breadth first search

## 示例代码
```python
def dfs(node): 
if node in visited: 
# already visited 
return
 visited.add(node) 
 # process current node 
# ... # logic here 
 dfs(node.left) 
 dfs(node.right)
```

## 深度优先搜索Depth-First-Search

### DFS 代码 - 递归写法
```python
visited = set() 
def dfs(node, visited): 
if node in visited: # terminator 
# already visited 
return 
 visited.add(node) 
# process current node here. 
...
for next_node in node.children(): 
if not next_node in visited: 
 dfs(next node, visited)
```

### DFS 代码 - 非递归写法

```python
def DFS(self, tree): 
if tree.root is None: 
return [] 
 visited, stack = [], [tree.root] 
while stack: 
 node = stack.pop() 
 visited.add(node) 
 process (node) 
 nodes = generate_related_nodes(node) 
 stack.push(nodes) 
# other processing work 
...
```

## 广度优先搜索Breadth-First-Search

### BFS 代码

```python
def BFS(graph, start, end): 
 queue = [] 
 queue.append([start]) 
 visited.add(start) 
while queue: 
 node = queue.pop() 
 visited.add(node) 
 process(node) 
 nodes = generate_related_nodes(node) 
 queue.push(nodes) 
# other processing work 
...
```

## 实战题目

1. https://leetcode-cn.com/problems/binary-tree-level-order-traversal/#/description

2. https://leetcode-cn.com/problems/minimum-genetic-mutation/#/description

3. https://leetcode-cn.com/problems/generate-parentheses/#/description

4. https://leetcode-cn.com/problems/fifind-largest-value-in-each-tree-row/#/description

## Homework

1. https://leetcode-cn.com/problems/word-ladder/description/

2. https://leetcode-cn.com/problems/word-ladder-ii/description/

3. https://leetcode-cn.com/problems/number-of-islands/

4. https://leetcode-cn.com/problems/minesweeper/description/

# 贪心算法 Greedy

贪心算法是一种在每一步选择中都采取在当前状态下最好或最优（即最有利）的选择，从而希望导致结果是全局最好或最优的算法。 

贪心算法与动态规划的不同在于它对每个子问题的解决方案都做出选择，不能回退。动态规划则会保存以前的运算结果，并根据以前的结果对当前进行选择，有回退功能。

贪心法可以解决一些最优化问题，如：求图中的最小生成树、求哈夫曼编码等。然而对于工程和生活中的问题，贪心法一般不能得到我们所要求的答案。 

一旦一个问题可以通过贪心法来解决，那么贪心法一般是解决这个问题的最好办法。由于贪心法的高效性以及其所求得的答案比较接近最优结果，贪心法也可以用作辅助算法或者直接解决一些要求结果不特别精确的问题。



## 实战题目

Coin Change 特别版本：

https://leetcode-cn.com/problems/coin-change/

当硬币可选集合固定：Coins = [20, 10, 5, 1]，整数倍时可以用贪心算法

求最少可以几个硬币拼出总数。 比如 total = 36

## 适用贪心算法的场景

简单地说，问题能够分解成子问题来解决，子问题的最优解能递推到最终问题的最优解。这种子问题最优解称为最优子结构。

贪心算法与动态规划的不同在于它对每个子问题的解决方案都做出选择，不能回退。动态规划则会保存以前的运算结果，并根据以前的结果对当前进行选择，有回退功能。

## Homework

1. https://leetcode-cn.com/problems/lemonade-change/description/

2. https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/description/

3. https://leetcode-cn.com/problems/assign-cookies/description/

4. https://leetcode-cn.com/problems/walking-robot-simulation/description/ 

5. https://leetcode-cn.com/problems/jump-game/

   https://leetcode-cn.com/problems/jump-game-ii/

# 二分查找

## 二分查找的前提

1. 目标函数单调性（单调递增或者递减）

2. 存在上下界（bounded）

3. 能够通过索引访问（index accessible)

## 代码模版

```python
left, right = 0, len(array) - 1
while left <= right:
 mid = (left + right) / 2
if array[mid] == target: # find the target!! 
break or return result 
 elif array[mid] < target:
 left = mid + 1
else:
 right = mid - 1
```

## 实战题目

1. https://leetcode-cn.com/problems/sqrtx/

   https://www.beyond3d.com/content/articles/8/ （扩展阅读）

2. https://leetcode.com-cn/problems/valid-perfect-square/

## Homework

1. https://leetcode-cn.com/problems/search-in-rotated-sorted-array/

2. https://leetcode-cn.com/problems/search-a-2d-matrix/

3. https://leetcode-cn.com/problems/fifind-minimum-in-rotated-sorted-array/