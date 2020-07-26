# 泛型递归、树的递归

## 前序知识回顾：

树的面试题解法一般都是递归 

1. 节点的定义

2. 重复性（自相似性）

## 示例代码 


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

## 递归Recursion

递归 - 循环

通过函数体来进行的循环

1. 从前有个山

2. 山里有个庙

3. 庙里有个和尚讲故事

4. 返回1

计算 n!

n！= 1 * 2 * 3 * … * n
```python
def Factorial(n): 

if n <= 1: 

return 1

return n * Factorial(n - 1)
```

factorial(6)

6 * factorial(5)

6 * (5 * factorial(4))

6 * (5 * (4 * factorial(3)))

6 * (5 * (4 * (3 * factorial(2))))

6 * (5 * (4 * (3 * (2 * factorial(1)))))

6 * (5 * (4 * (3 * (2 * 1))))

6 * (5 * (4 * (3 * 2)))

6 * (5 * (4 * 6))

6 * (5 * 24)

6 * 120

720

## Python 代码模版

```python

def recursion(level, param1, param2, ...): 

\# recursion terminator 

	if level > MAX_LEVEL: 
		process_result 
		return

\# process logic in current level 

	process(level, data...) 

\# drill down 

	self.recursion(level + 1, p1, ...) 

\# reverse the current level status if needed 
```

## Java 代码模版

```java
public void recur(int level, int param) {

// terminator 

		if (level > MAX_LEVEL) {

// 			process result 

 		return; 

}

// process current logic 

 		process(level, param);

// drill down 

 		recur( level: level + 1, newParam);

// restore current status 

}
```

## 思维要点

1. 不要人肉进行递归（最大误区）

2. 找到最近最简方法，将其拆解成可重复解决的问题（重复子问题）

3. 数学归纳法思维

## 实战题目

1. https://leetcode-cn.com/problems/climbing-stairs/

2. https://leetcode-cn.com/problems/generate-parentheses/

## 实战题目

1. https://leetcode-cn.com/problems/invert-binary-tree/description/

2. https://leetcode-cn.com/problems/validate-binary-search-tree

3. https://leetcode-cn.com/problems/maximum-depth-of-binary-tree

4. https://leetcode-cn.com/problems/minimum-depth-of-binary-tree

5. https://leetcode-cn.com/problems/serialize-and-deserialize-binary-tree/

## Homework

1. https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-tree/

2. https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal

3. https://leetcode-cn.com/problems/combinations/

4. https://leetcode-cn.com/problems/permutations/

5. https://leetcode-cn.com/problems/permutations-ii/

   

   

   

# 分治、回溯
## 分治Divide & Conquer

### 分治代码模板

```python

def divide_conquer(problem, param1, param2, ...): 

\# recursion terminator 

	if problem is None: 

 		print_result 

		return

\# prepare data 

 	data = prepare_data(problem) 

 	subproblems = split_problem(problem, data) 

\# conquer subproblems 

 	subresult1 = self.divide_conquer(subproblems[0], p1, ...) 

 	subresult2 = self.divide_conquer(subproblems[1], p1, ...) 

 	subresult3 = self.divide_conquer(subproblems[2], p1, ...) 

...

\# process and generate the final result 

 	result = process_result(subresult1, subresult2, subresult3, …) 

\# revert the current level states 
```

## 回溯Backtracking

回溯法采用试错的思想，它尝试分步的去解决一个问题。在分步解决问题的过程中，当它通过尝试发现现有的分步答案不能得到有效的正确的解答的时候，它将取消上一步甚至是上几步的计算，再通过其它的可能的分步解答再次尝试寻找问题的答案。

回溯法通常用最简单的递归方法来实现，在反复重复上述的步骤后可能出现两种情况：

• 找到一个可能存在的正确的答案；

• 在尝试了所有可能的分步方法后宣告该问题没有答案。

在最坏的情况下，回溯法会导致一次复杂度为指数时间的计算。

### 预习题目

1. https://leetcode-cn.com/problems/powx-n/

2. https://leetcode-cn.com/problems/subsets/

### 实战题目

1. https://leetcode-cn.com/problems/majority-element/description/ （简单、但是高频）

2. https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number/

3. https://leetcode-cn.com/problems/n-queens/