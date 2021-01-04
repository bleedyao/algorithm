# algorithm
最近开始总结数据结构与算法的内容，本项目中主要放置的是算法题目和我自己理解并写出的参考答案。

答案很可能不是最优解，如果有朋友有更好的更优的解法，欢迎提交 issues。

## Test03
题目：找出数组中重复的数字。
在一个长度为 n 的数组中的所有数字都在 0 ~ n-1 的范围内，数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。例如：如果输入长度为 7 的数组 {2，3，1，0，2，5，3} 那么对应的输出是重复的数字 2 或者 3。

## Demo01
设有一组 N 个数而要确定其中第 k 个最大值。

## Demo02
编写一个递归方法，它返回数 N 的二进制表示中 1 的个数。利用这样的事实：如果 N 是奇数，那么其 1 的个数等于 N/2 的二进制表示中 1 的个数加 1

## Demo03
编写下列声明的方法：
public void permute(String str)
private void permute(char[] str,int low,int high)
第一个方法是个驱动程序，它调用第二个方法并显示 String str 中的字符的所有排列。
如果 str 是 "abc"，那么输出的字符串则是 abc，acb，bac，bca，cab 和 cba。
第二个方法使用递归。

# 题目列表

* 01_reverse-linked-list
* 02_swap-nodes-in-pairs
* 03_linked-list-cycle
* 04_linked-list-cycle-ii
* 05_reverse-nodes-in-k-group

# 算法训练方针
## 如何系统的学习算法和数据结构
* 职业顶尖级别 - 对于算法数据结构的理解
* 一线互联网公司面试
* LeetCode 300+ 练习

## 训练方法
* Chunk it up 切碎知识点
    * 庖丁解牛
    * 脉络连接
* Deleberate Practicing 刻意练习
* feedback 反馈

### 数据结构
* 一维
    * 基础：数组 array，链表 linked list
    * 高级：栈 stack，队列 queue，双端队列 deque，集合 set，映射 map
* 二维
    * 基础：树 tree，图 graph
    * 高级：二叉搜索树 binary search tree（red-black tree, AVL）,堆 heap,并查集 disjoint set,字典树 Trie
* 特殊
    * 位运算 bitwise，布隆过滤器 bloomFilter
    * LRU Cache

### 算法
* If-else, switch -> branch
* for, while loop -> Iteration
* 递归 Recursion (Divide & Conquer, Backtrace)
* 搜索 Search：深度优先搜索 Depth first search, 广度优先搜索 Breadth first search, A*
* 动态规划 Dynamic Programming
* 二分查找 Binary Search
* 贪心 Greedy
* 数学 Math，几何 Geametry
注意：在头脑中回忆上面每种算法的思想和代码模板

## 切题四件套
* Clarification 理解清晰
* Possible solutions 想所有可能的解法，比较时间和空间负责度
* Coding 
* Test cases

## 刷题方法
### 第一遍刷题
* 读题 + 思考
* 直接看解法，比较解法的优劣
* 背诵和默写解法

### 第二遍刷题
* 马上自己写 -> 提交 Leetcode
* 多种解法比较，体会 -> 优化

### 第三遍刷题
* 过了一天之后，复习相同的题目

### 第四遍刷题
* 过了一周之后，复习相同的题目

### 第五遍刷题
* 面试之前，复习相同的题目

# 时间和空间复杂度
* 经常面试的算法
* 二分法
* 二叉树
* 二维矩阵的二分查找
* 归并排序
* 二叉树的前序，中序，后序遍历
* 图的遍历：时间复杂度是多少？
* 搜索算法：DFS, BFS时间复杂度是多少？
* 二分查找：时间复杂度是多少？

# 数组，链表，跳表