// Leetcode 1672 - Richest Customer Wealth
// Difficulty : Easy
// Approach: Iterate through the 2D array and calculate the sum of wealth
// of each customer. Keep track of the maximum wealth found.
// Time Complexity : O(m * n)
// Space Complexity : O(1)

class Solution 
{
    public int maximumWealth(int[][] accounts) 
    {
        int max = 0;
        for(int i = 0; i < accounts.length; i++)
        {
            int rowSum = 0;
            for(int j = 0; j < accounts[i].length; j++)
            {
                rowSum = rowSum + accounts[i][j]; 
            }
            if(max < rowSum)
            {
              max = rowSum;
            }
        }
        return max;
    }
}