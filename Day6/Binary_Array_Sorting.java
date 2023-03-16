class Solution
{
    //Function to sort the binary array.
    static void binSort(int A[], int N)
    {
        // add your code here
        
        int z=0,o=0;
        for(int i= 0;i<N;i++)
        {
           if(A[i]==0)
           {
               z++;
           }
           else
                o++;
        }
        int i =0;
        while(i<N)
        {
            while(z>0){
                A[i]=0;
                z--;
                i++;
            }
            while(o>0){
                A[i]=1;
                o--;
                i++;
            }
            
        }
        
        /**************
        * No need to print the array
        * ************/
    }
}