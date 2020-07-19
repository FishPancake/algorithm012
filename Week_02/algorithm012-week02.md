# 哈希表、映射、集合

## Hash table

哈希表（Hash table），也叫散列表，是根据关键码值（Key value）而直接进行访问的数据结构。

它通过把关键码值映射到表中一个位置来访问记录，以加快查找的速度。

这个映射函数叫作散列函数（Hash Function），存放记录的数组叫作哈希表（或散列表）。

## 工程实践

• 电话号码簿

• 用户信息表

• 缓存（LRU Cache） 

• 键值对存储（Redis）

## 复杂度分析

| 操作   | 时间复杂度 |
| ------ | ---------- |
| lookup | O(1)       |
| insert | O(1)       |
| delete | O(1)       |

*红黑树复杂度：

| 操作   | 时间复杂度 |
| ------ | ---------- |
| lookup | O(log(n))  |
| insert | O(log(n))  |
| delete | O(log(n))  |

## Java code

### •Map：key-value对，key不重复

\- new HashMap() / new TreeMap()

\- map.set(key, value)

\- map.get(key)

\- map.has(key)

\- map.size()

\- map.clear()

### •Set：不重复元素的集合

\- new HashSet() / new TreeSet()

\- set.add(value)

\- set.delete(value)

\- set.hash(value)

## Python code

list_x = [1, 2, 3, 4]

map_x = {

‘jack’: 100, 

‘张三’: 80, 

‘selina’: 90, 

…

}

set_x = {‘jack’, ‘selina’, ‘Andy’}

set_y = set([‘jack’, ‘selina’, ‘jack’])

## Map, Set : interfaces

### • Java set classes:

TreeSet, HashSet,ConcurrentSkipListSet, CopyOnWriteArraySet, EnumSet, JobStateReasons, LinkedHashSet

https://docs.oracle.com/en/java/javase/12/docs/api/java.base/java/util/Set.html

### • Java map classes:

HashMap, Hashtable, ConcurrentHashMap

https://docs.oracle.com/en/java/javase/12/docs/api/java.base/java/util/Map.html

## 实战题目

1. https://leetcode-cn.com/problems/valid-anagram/description/

2. https://leetcode-cn.com/problems/group-anagrams/

3. https://leetcode-cn.com/problems/two-sum/description/

### 小技巧

养成收藏精选代码的习惯：https://shimo.im/docs/R6g9WJV89QkHrDhr

# 树、二叉树、二叉搜索树

> **Linked List 是特殊化的 Tree**
>
> **Tree 是特殊化的 Graph**

## 示例代码

### Python

```python
class TreeNode:
	def __init__(self, val): 
		self.val = val
		self.left, self.right = None, None
```

### C++
```c++
struct TreeNode { 
	int val; 
	TreeNode *left; 
	TreeNode *right; 
	TreeNode(int x) : val(x), left(NULL), right(NULL) {} 
}
```
### Java
```java
public class TreeNode {
	public int val;
	public TreeNode left, right;
	public TreeNode(int val) {
		this.val = val;
		this.left = null;
		this.right = null; } }
```
## 二叉树遍历 Pre-order/In-order/Post-order
1.前序（Pre-order）：根-左-右
2.中序（In-order）：左-根-右
3.后序（Post-order）：左-右-根

示例代码
```python
def preorder(self, root): 
	if root: 
		self.traverse_path.append(root.val) 
		self.preorder(root.left) 
		self.preorder(root.right)
def inorder(self, root):
	if root: 
		self.inorder(root.left) 
		self.traverse_path.append(root.val) 
		self.inorder(root.right)
def postorder(self, root):
	if root: 
		self.postorder(root.left) 
		self.postorder(root.right) 
		self.traverse_path.append(root.val)
```

## 二叉搜索树 Binary Search Tree

二叉搜索树，也称二叉排序树、有序二叉树（Ordered Binary Tree）、排序二叉树（Sorted Binary Tree），是指一棵空树或者具有下列性质的二叉树：

1. 左子树上所有结点的值均小于它的根结点的值；

2. 右子树上所有结点的值均大于它的根结点的值；

3. 以此类推：左、右子树也分别为二叉查找树。 （这就是 重复性！）

中序遍历：升序排列

## 二叉搜索树常见操作

1.  查询
2.  插入新结点（创建）
3.  删除

Demo: https://visualgo.net/zh/bst

## 复杂度分析

| 操作   | 时间复杂度 |
| ------ | ---------- |
| lookup | O(log(n))  |
| insert | O(log(n))  |
| delete | O(log(n))  |

## 实战题目

1. https://leetcode-cn.com/problems/binary-tree-inorder-traversal/ 

2. https://leetcode-cn.com/problems/binary-tree-preorder-traversal/ 

3. https://leetcode-cn.com/problems/n-ary-tree-postorder-traversal/ 

4. https://leetcode-cn.com/problems/n-ary-tree-preorder-traversal/

5. https://leetcode-cn.com/problems/n-ary-tree-level-order-traversal/

# 堆 Heap和二叉堆Binary Heap

## 堆 Heap

Heap：可以迅速找到一堆数中的最大或者最小值的数据结构。

将根节点最大的堆叫做大顶堆或大根堆，根节点最小的堆叫做小顶堆或者小根堆。

常见的堆有二叉堆、斐波那契堆等。

假设是大顶堆，则常见操作（API）：

find-max:O(1)

Delete-max:O(logN)

insert(create):O(logN)/O(1)

不同实现的比较：https://en.wikipedia.org/wiki/Heap_(data_structure)

## 二叉堆性质

通过完全二叉树来实现（注意：不是二叉搜索树）；

二叉堆（大顶）满足以下性质：

- 是一颗完全树。
- 树中任意节点的值总是>=其子节点的值。

## 二叉堆实现细节

1. 二叉堆一般都通过“数组”实现
2. 假设“第一个元素”在数组中索引为0的话，则父节点和子节点的位置关系如下：
   1. 根节点（堆顶元素）是：a[0]
   2. 索引为i的左孩子索引是2*i+1;
   3. 索引为i的右孩子索引是2*i+2;
   4. 索引为i的父孩子索引是(i-1)/2;

## Insert插入操作

1. 新元素一律先插入到堆的尾部
2. 依次向上调整整个堆的结构（一直到根即可）

**HeapifyUp**

**O(logN)**

## Delete Max删除堆顶操作

1. 将堆尾元素替换到顶部（即堆顶被替代删除掉）
2. 依次从根部向下调整整个堆的结构（一直到堆尾即可）

**HeapifyDown**

**O(logN)**

### **注意：二叉堆是堆（优先队列priority queue）的一种常见且简单的实现，但并不是最优的实现

**https://en.wikipedia.org/wiki/Heap_(data_structure)**

## 实战例题

1. https://leetcode-cn.com/problems/zui-xiao-de-kge-shu-lcof/
2. https://leetcode-cn.com/problems/sliding-window-maximum/
3. https://leetcode-cn.com/problems/top-k-frequent-elements/
4. https://leetcode-cn.com/problems/chou-shu-lcof/













