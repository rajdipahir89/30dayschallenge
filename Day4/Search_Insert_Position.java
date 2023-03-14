class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=nums.length;
        int start=0,end=l-1;
        int mid=start+(end-start)/2;
        while(start<=end)
        {
          
            if(nums[mid]<target && start==end)
            {
                mid++;
                break;
            } 
            else if(nums[mid]==target)
            {
                break;
            }
            else if(nums[mid]<target)
            {
                    start=mid+1;
            }
            else
            {
                    end=mid-1;
            }
             mid=start+(end-start)/2;
        }
        return mid;
    }
}