# Strings

1. [Is Subsequence](https://leetcode.com/problems/valid-palindrome) $\color{#14b886}{Easy}$ &#x2713;

2. Valid Palindrome $\color{#14b886}{Easy}$ &#x2713;

3. Longest Common Prefix $\color{#14b886}{Easy}$

4. Zigzag Conversion $\color{#ecbf14}{Medium}$

5. Reverse Words in a String $\color{#ecbf14}{Medium}$

6. Guess the Word $\color{#e7364b}{Hard}$

## Solutions
1. The solution is similar to a two pointer like the ones I've made for the array problems. We basically have a searchFromIndex that keeps track
of the last element where we have found the continuation of the subsequence

2. The solution is to use a two pointer to check if the char at each pointer is a alphanumeric or not. If they are, then compare each of the characters. If they're different return false
