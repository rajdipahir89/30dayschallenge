
class Solution
{
    // arr[]: input array
    // n: size of the array
    //Function to find triplets with zero sum.
	public boolean findTriplets(int arr[] , int n)
    {
        int k,j,sum=0;
        //add code here.
        Arrays.sort(arr);
        
        for(int i=0;i<n;i++)
        {
            int left=i+1,right=n-1;
            while(left<right)
            {
                
                sum=arr[i]+arr[left]+arr[right];  
            
                if(sum==0)
                {
                    return true;
                }
                else if(sum>0)
                {
                    right--;
                }
                else
                {
                    left++;
                }
            }
            
        }
            return false;
    }
}