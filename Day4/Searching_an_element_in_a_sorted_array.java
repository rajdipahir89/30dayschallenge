class Solution{
    static int searchInSorted(int arr[], int N, int K)
    {
        
        // Your code here
        int start=0,end=N-1,mid=0;
        
       while(start<=end)
        {
             mid=(start+(end-start)/2);
            if((mid==0 || K>arr[mid-1])&&arr[mid]==K)
            {
                return 1;
            }
            else if(arr[mid]<K)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return -1;
    }
}