//User function Template for Java

class Solution{
	int equalSum(int [] A, int N) {
		
		//Write your code here
		int sum = 0;
		for(int i = 0; i<N; i++)
		    sum += A[i];
		    
		 int currSum = 0;
		for(int i = 0; i<N; i++){
		    currSum += A[i];
		    // to find left sum
		    int lSum = currSum - A[i];
		    // to find rightsum
		    int rSum = sum - currSum;
		    // now if both are equal then we found that element
		    if(lSum == rSum) return i+1;
		}
		return -1;
	}
}