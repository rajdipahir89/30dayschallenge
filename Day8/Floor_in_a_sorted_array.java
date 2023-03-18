class Solution{
    
    // Function to find floor of x
    // arr: input array
    // n is the size of array
    static int findFloor(long arr[], int n, long x)
    {
        
        if(x>arr[n-1])
        {
                return n-1;
        }
         
        int start=0,end=n-1;
        int k=-1;
        while(start<=end)
         {
            int mid=start+(end-start)/2;
            if(arr[mid]==x || arr[mid]<x)
            {
                k=mid;
                start=mid+1;
            }
            else if(arr[mid]<x)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
         }
        return k;
        
    }
    
}
