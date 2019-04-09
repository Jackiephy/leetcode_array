# leetcode_array 
Starting today, I will use github to record my leetcode brushing experience. I will put the questions, answers and thoughts of each day in github for reference.
The first part is named 'leetcode_array', I will pick out some questions related to array for practice.
## I will put these questions into this repository:
1.	Remove Element  	
26.	Remove Duplicates from Sorted Array  	
80.	Remove Duplicates from Sorted Array II  	
277.	Find the Celebrity  	&emsp;*Locked*
189.	Rotate Array  	
41.	First Missing Positive  	
299.	Bulls and Cows  	
134.	Gas Station  	
118.	Pascal's Triangle  
119.	Pascal's Triangle II  
169.	Majority Element  
229.	Majority Element II  
274.	H-Index  	
275.	H-Index II	Binary Search  
243.	Shortest Word Distance  	
244.	Shortest Word Distance II  	
245.	Shortest Word Distance III  	
217.	Contains Duplicate  	
219.	Contains Duplicate II  
220.	Contains Duplicate III  
55.	Jump Game  	
45.	Jump Game II  	
121.	Best Time to Buy and Sell Stock  	
122.	Best Time to Buy and Sell Stock II  	
123.	Best Time to Buy and Sell Stock III  	
188.	Best Time to Buy and Sell Stock IV  	
309.	Best Time to Buy and Sell Stock with Cooldown  	
11.	Container With Most Water  	
42.	Trapping Rain Water  	
334.	Increasing Triplet Subsequence  	
128.	Longest Consecutive Sequence  	
164.	Maximum Gap	Bucket  
287.	Find the Duplicate Number  	
135.	Candy  
330.	Patching Array  
4.	Median of Two Sorted Arrays  	
321.	Create Maximum Number  
327.	Count of Range Sum  
289.	Game of Life  			
57.	Insert Interval  	
56.	Merge Intervals  	
252.	Meeting Rooms  	
253.	Meeting Rooms II  	
352.	Data Stream as Disjoint Intervals	TreeMap  	
239.	Sliding Window Maximum  	
295.	Find Median from Data Stream  	
53.	Maximum Subarray  	
325.	Maximum Size Subarray Sum Equals k  	
209.	Minimum Size Subarray Sum  	
238.	Product of Array Except Self  	
152.	Maximum Product Subarray  	
228.	Summary Ranges  	
163.	Missing Ranges  	
88.	Merge Sorted Array  	
75.	Sort Colors  	
283.	Move Zeroes  	
376.	Wiggle Subsequence  	
280.	Wiggle Sort  	
324.	Wiggle Sort II  

## 2019/4/8 completed list:
### 27.	Remove Element  &emsp;`easy` <font color='green'>easy</font>
- Given an array nums and a value val, remove all instances of that value in-place and return the new length.
Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
The order of elements can be changed. It doesn't matter what you leave beyond the new length.

- Example 1:
Given nums = [3,2,2,3], val = 3,
Your function should return length = 2, with the first two elements of nums being 2.
It doesn't matter what you leave beyond the returned length.

- Example 2:
Given nums = [0,1,2,2,3,0,4,2], val = 2,
Your function should return length = 5, with the first five elements of nums containing 0, 1, 3, 0, and 4.
Note that the order of those five elements can be arbitrary.
It doesn't matter what values are set beyond the returned length.

### 26.	Remove Duplicates from Sorted Array  &emsp;`easy`
- Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

- Example 1:
Given nums = [1,1,2],
Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
It doesn't matter what you leave beyond the returned length.

- Example 2:
Given nums = [0,0,1,1,1,2,2,3,3,4],
Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.
It doesn't matter what values are set beyond the returned length.

### 80.	Remove Duplicates from Sorted Array II  &emsp;`medium`
- Given a sorted array nums, remove the duplicates in-place such that duplicates appeared at most twice and return the new length.
Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

- Example 1:
Given nums = [1,1,1,2,2,3],
Your function should return length = 5, with the first five elements of nums being 1, 1, 2, 2 and 3 respectively.
It doesn't matter what you leave beyond the returned length.

- Example 2:
Given nums = [0,0,1,1,1,1,2,3,3],
Your function should return length = 7, with the first seven elements of nums being modified to 0, 0, 1, 1, 2, 3 and 3 respectively.
It doesn't matter what values are set beyond the returned length.

## 2019/4/9 completed list:
### 189.	Rotate Array  &emsp;`easy`
- Given an array, rotate the array to the right by k steps, where k is non-negative.

- Example 1:  
Input: [1,2,3,4,5,6,7] and k = 3  
Output: [5,6,7,1,2,3,4]  
Explanation:  
rotate 1 steps to the right: [7,1,2,3,4,5,6]  
rotate 2 steps to the right: [6,7,1,2,3,4,5]  
rotate 3 steps to the right: [5,6,7,1,2,3,4]  

- Example 2:  
Input: [-1,-100,3,99] and k = 2  
Output: [3,99,-1,-100]  
Explanation:   
rotate 1 steps to the right: [99,-1,-100,3]  
rotate 2 steps to the right: [3,99,-1,-100]  

### 41.	First Missing Positive  &emsp;`hard`
- Given an unsorted integer array, find the smallest missing positive integer.

- Example 1:  
Input: [1,2,0]  
Output: 3  

- Example 2:    
Input: [3,4,-1,1]  
Output: 2  

- Example 3:    
Input: [7,8,9,11,12]  
Output: 1  
