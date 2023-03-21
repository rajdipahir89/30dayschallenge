class Solution{
    
     int Maximize(int arr[], int n)
    {
        // Complete the function
        long sum=0;
        int mod=1000000007;
        Arrays.sort(arr);
        for(int i=0;i<n;i++)
        {
            sum=(sum+(long)arr[i]*i)%mod;
        }
       
        return (int)sum;
        
    }   
}