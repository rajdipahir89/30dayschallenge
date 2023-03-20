class Solution {
    void nextGreatest(int arr[], int n) {
        // code here
        int right = arr[n-1];
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]>right){
                int temp = arr[i];
                arr[i]=right;
                right=temp;
            }
            else
                arr[i]=right;
        }
        arr[n-1]=-1;
    }
}