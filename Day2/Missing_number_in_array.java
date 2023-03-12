class Solution {
    int MissingNumber(int array[], int n) {
        // Your Code Here
        Arrays.sort(array);
        int i;
       
        for(i=0;i<n-1;i++)
        {
            if(array[i]!=i+1)
            {
                break;
            }
            
        }
           return i+1;
    }
}