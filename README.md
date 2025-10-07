# Strings

1. [Is Subsequence](https://leetcode.com/problems/valid-palindrome) $\color{#14b886}{Easy}$ &#x2713;

2. [Valid Palindrome](https://leetcode.com/problems/valid-palindrome) $\color{#14b886}{Easy}$ &#x2713;

3. [Longest Common Prefix](https://leetcode.com/problems/longest-common-prefix/description) $\color{#14b886}{Easy}$ &#x2713;

4. [Zigzag Conversion](https://leetcode.com/problems/zigzag-conversion/description/) $\color{#ecbf14}{Medium}$ &#x2713;

5. Reverse Words in a String $\color{#ecbf14}{Medium}$

6. Guess the Word $\color{#e7364b}{Hard}$

## Solutions
1. The solution is similar to a two pointer like the ones I've made for the array problems. We basically have a searchFromIndex that keeps track
of the last element where we have found the continuation of the subsequence

2. The solution is to use a two pointer to check if the char at each pointer is a alphanumeric or not. If they are, then compare each of the characters. If they're different return false

3. The solution is to use indexOf to check if the elements have any prefixes in common. Need to remember that function

4. We make a stringbuilder array, that contains an x amount of stringbuilder elements corresponding to the numberofrows required by the problem. We then initiate a variable to check the currentRow and a variable to determine if we need to changeDirection. We turn every element of the string into a character and append the character to our stringbuilder array according to our currentRow to determine which element it belongs to. We then check if the currentRow is 0 or has it reached numRows -1, and if so we flip the value of changeDirection. We then add or subtract currentRow according to the current value of changeDirection. We then bundle every element inside of our stringbuilder array into a result.