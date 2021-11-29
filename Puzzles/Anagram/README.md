Alice recently started learning about cryptography and wants to create her own encryption method. 
Alice decides to generate a random seed for her encryption by transforming two strings into anagrams by removing characters from each string as necessary.

Two words are anagrams of each other if the first word's letters can be rearranged to form the second word. 
So, the two strings must have the same characters (in any order) and the same length. For instance, given the strings and
Alice can remove the from to have which is an anagram of . The minimum number of operations performed to create the anagram is so that will be her seed value.

Your challenge is to complete a line of code to calculate this seed value. 
You will be given two strings and must cumulate the minimum number of characters that must be removed from each string to create an anagram.

Input Format

Two lines each containing a string. 

Input

cde
abc

output
4
