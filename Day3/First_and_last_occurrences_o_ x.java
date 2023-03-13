class GFG
{
    ArrayList<Long> find(long arr[], int n, int x)
    {
       
        // code here
        
        int left=0,right=n-1,mid=0;
        long first=-1,last=-1;
    
        while(left<=right)
        {
             mid=(left+(right-left)/2);
            if((mid==0 || x>arr[mid-1])&&arr[mid]==x)
            {
                first=mid;
                break;
            }
            else if(arr[mid]<x)
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
        
           left=0;
           right=n-1;
           mid=0;
        while(left<=right)
        {
            mid=(left+(right-left)/2);
            if((mid == n-1|| x<arr[mid+1]) && arr[mid]==x)
            {
                last=mid;
               // left=mid+1;
               break;
            }
            else if(x < arr[mid])
            {
                right = mid - 1;
            }
            else
            {
                left = mid + 1;
            
            }
        }
        ArrayList<Long> al = new ArrayList<Long>();
        al.add(first);
        al.add(last);
        
        return al;
    }
}