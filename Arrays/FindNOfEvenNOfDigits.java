// Leetcode 1295 - Find Number with even number of digits
// Difficulty : Easy
// Approach: Iterate through the array and count digits of each number using division by 10.
// Add numbers having an even number of digits to the count.
// Time Complexity : O(n)
// Space Complexity : O(1)

class Solution 
{
    public int findNumbers(int[] nums)
    {
     int n=0, c=0, d=0;
     for(int i = 0; i < nums.length; i++)
     {
        while(nums[i] > 0)
        {
            d = nums[i] % 10;
            nums[i] = nums[i] / 10;
            n++;
        }
        if(n % 2 == 0)
        {
            c++;
        }
        n = 0;
     }
     return c;   
    }
}
