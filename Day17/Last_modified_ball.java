class Solution {
    int solve(int N, int[] A) {
        // code here
        for(int i = N-1; i>=0; i--){
            // to find where we can insert the ball
            if(A[i] < 9)
            // if we find it then return it as 1 based indexing
                return i+1;
        }
        return 1;
    }
};