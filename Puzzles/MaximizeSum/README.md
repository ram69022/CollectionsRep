You are given an array of integers. You want to choose some integers from the array subject to the condition that the number of distinct integers chosen should not exceed. 
Your task is to maximize the sum of chosen numbers. 

Input format

The first line contains a single integer denoting the number of test cases.
The first line of each test case contains two space-separated integers and denoting the length of the array and the maximum number of distinct integers you can choose.
The second line of each test case contains space-separated integers denoting the integer array

Output format

For each test case(in a separate line), print the maximum sum you can obtain by choosing some elements such that the number of distinct integers chosen is at most. 
If you cannot choose any element, output 0.

Constraints:
1<=T<=1000
1<=K<=N<=5 x 10^5
-10^9 <= A <=10^9

2
4 1
3 -1 2 5
4 2
2 1 2 5

Output 

5
9

