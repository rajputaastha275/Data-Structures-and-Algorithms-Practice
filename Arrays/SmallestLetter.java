// Leetcode 744 - Find Smallest Letter Greater Than Target
// Difficulty : Easy
// Approach: Apply binary search to find the smallest letter greater than target.
// If target is greater than or equal to the current letter, search in the right half.
// Otherwise, search in the left half.
// Use modulo operation to handle the circular case when no greater letter exists.
// Time Complexity : O(log n)
// Space Complexity : O(1)

public class SmallestLetter 
{
    public char nextGreatestLetter(char[] letters, char target) 
    {
       int start = 0;
       int end = letters.length - 1;

       while(start <= end)
       {
            int mid = start + (end - start) / 2;

            if(target < letters[mid])
            {
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }
       }
       return letters[start % letters.length]; 
    }
} 
