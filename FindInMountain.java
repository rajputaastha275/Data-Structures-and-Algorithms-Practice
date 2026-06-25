// Leetcode 1095 - Find in Mountain Array
// Difficulty : Hard
// Approach: Apply binary search in three steps.
// First, find the peak element of the mountain array using binary search.
// Then search for the target in the increasing part (left side of peak)
// using normal binary search.
// If the target is not found, search in the decreasing part (right side of peak)
// using modified binary search.
// Time Complexity : O(log n)
// Space Complexity : O(1)
 
class Solution 
{
    public int findInMountainArray(int target, MountainArray mountainArr) 
    {
        int start = 0;
        int end = mountainArr.length() - 1;
        while(start < end)
        {
            int mid = start + (end - start)/2;
            if(mountainArr.get(mid) > mountainArr.get(mid + 1))
            {
                end = mid;
            }
            else
            {
                start = mid + 1;
            }
        }
        int peak = start;
	  //left side
	  start = 0;
	  end = peak;
	  while(start <= end)
	  {
		int mid = start + (end - start)/2;
		if(mountainArr.get(mid) < target)
		{
			start = mid + 1;
		}
		else if(mountainArr.get(mid) > target)
		{
			end = mid - 1;
		}
		else
		{
			return mid; 
		}
	}
	//right side
	start = peak + 1;
	end = mountainArr.length()-1;
	while(start <= end)
	{
		int mid = start + (end - start)/2;
		if(mountainArr.get(mid) < target)
		{
			end = mid - 1;
		}
		else if(mountainArr.get(mid) > target)
		{
			start = mid + 1;
		}
		else
		{
			return mid; 
		}
	  }
	  return -1;
        
    }
}


