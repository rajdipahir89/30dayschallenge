class Solution {
    void leftRotate(int[] arr, int n, int d) {
        // code here
        d%=n;
        int myarr[] = new int[n];
        int k=0;
       for(int i=0;i<d;i++)
        {
           myarr[i]=arr[i];
        }
        
        for(int i = d ; i<n;i++ )
        {
            arr[k]=arr[i];
            k++;
        }
        
        for(int i=0;i<d;i++)
        {
            arr[k]=myarr[i];
            k++;
        }
    }
}