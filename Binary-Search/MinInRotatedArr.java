// Leetcode 153 - Find Minimum in Rotated Sorted Array
// Difficulty : Medium
// Approach:
// Use binary search to locate the pivot (the point where the sorted order breaks).
// If nums[mid] > nums[mid + 1], then nums[mid + 1] is the minimum.
// If nums[mid - 1] > nums[mid], then nums[mid] is the minimum.
// Otherwise, decide which half contains the pivot by comparing nums[start] and nums[mid].
// Continue searching until the minimum element is found.
// If no pivot exists, the array is already sorted, so return the first element.
//
// Time Complexity : O(log n)
// Space Complexity : O(1)

class Solution 
{
    public int findMin(int[] nums) 
    {
        int start = 0;
        int end = nums.length - 1;
        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            if((mid < end) && (nums[mid] > nums[mid + 1]))
            {
                return nums[mid + 1];
            }
            else if((mid > start) && (nums[mid -1] > nums[mid]))
            {
                return nums[mid];
            }
            else if(nums[start] >= nums[mid])
            {
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }
        }
        return nums[0];
    }
}