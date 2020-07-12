### 摒弃旧习惯
不要死磕
五毒神掌（敢于放手、敢于死记硬背）
不懒于看高手代码（国际版的高票回答）

最佳方式：
5分钟想不出来，直接看题解或高票，用五毒神掌变成自己的东西。
最差方式：
死磕单挑，很快放弃。

五毒神掌关键是五，过遍数。一道题做五遍。

chunk it up！

### 数据结构
#### 一维
- 基础：
数组、链表
- 高级：
栈、队列、双端队列、几何、映射.etc
#### 二维
- 基础：
树、图
- 高级：
二叉搜索树、堆、并查集、字典树
#### 特殊
- 位运算、布隆过滤器
- LRU Cache

### 算法
- if-else，switch
- for，while loop
- 递归Resursion
- 搜索Search：深度优先搜索Depth first search，广度优先搜索Breadth first search，A*，etc
- 动态规划Dynamic Programming
- 二分查找Binary Search
- 贪心Greedy
- 数学Math，几何Geometry


### 五毒神掌
#### 第一遍
- 5分钟读题思考
- 直接看解法：多解法，比较优劣
- 背诵默写好解法
#### 第二遍
- 马上自己写-leetcode提交
- 比较多解法优劣
#### 第三遍
- 一天后，重复做题
- 不同解法熟练程度-专项练习
#### 第四遍
- 一周后，反复做题
#### 第五遍
- 面试前一周恢复性训练

### 时空复杂度

#### Big O notation
- O(1) 常数复杂度
- O(log n) 对数复杂度
- O(n) 线性时间复杂度
- O(n^2) 平方
- O(n^3) 立方
- O(2^n) 指数
- O(n!) 阶乘



### Array

Java, C++: int a[100];

Python: list = []

JavaScript: let x = [1, 2, 3]

| 操作   | 时间复杂度 |
| ------ | ---------- |
| lookup | O(1)       |
| insert | O(n)       |
| delete | O(n)       |

### Linked List

工程应用：LRU Cache

|  操作    |  时间复杂度  |
| ---- | ---- |
|   append   |   O(1)   |
|   lookup   |   O(n)   |
|   insert   |   O(1)   |
|   delete   |   O(1)   |
|   prepend   |   O(1)   |

### Skip List

**注意：只能用于元素有序的情况。**

##### 升维思想 + 空间换时间

| 操作   | 时间复杂度 |
| ------ | ---------- |
| lookup | O(logn)    |
| insert | O(logn)    |
| delete | O(logn)    |

​		跳表（skip list）对标的是平衡树（AVL Tree）和二分查找，是一种 插入/删除/搜索 都是 O(log n) 的数据结构。1989 年出现。它最大的优势是原理简单、容易实现、方便扩展、效率更高。因此在一些热门的项目里用来替代平衡树，如 Redis、LevelDB 等。

#### 时间复杂度

n/2、n/4、n/8、第 k 级索引结点的个数就是 n/(2^k)

假设索引有 h 级，最高级的索引有 2 个结点。n/(2^h) = 2，从而求得 h = log2(n)-1

索引的高度：logn，每层索引遍历的结点个数：3

在跳表中查询任意数据的时间复杂度就是 O(logn)

#### 空间复杂度

原始链表大小为 n，每 2 个结点抽 1 个，每层索引的结点数： n/2,n/4,n/8,……8,4,2

原始链表大小为 n，每 3 个结点抽 1 个，每层索引的结点数： n/3,n/9,n/27,……9,3,1

空间复杂度是 O(n)

### Stack

Stack：先入后出；添加、删除皆为 O(1)

### Queue

Queue：先入先出；添加、删除皆为 O(1)

### Deque: Double-End Queue

1. 简单理解：两端可以进出的 Queue 
2. 插入和删除都是 O(1) 操作

### Priority Queue

1. 插入操作：O(1)
2. 取出操作：O(logN) - 按照元素的优先级取出
3. 底层具体实现的数据结构较为多样和复杂：heap、bst、treap



![image-20200712194122733](/Users/fishcake/Documents/image-20200712194122733.png)



