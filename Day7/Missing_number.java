class Compute {
    
    public static int missingNumber(int A[], int N)
    {
        int total=0;
        for(int i : A)
        {
            total+=i;
        }
        int sum = (N*(N+1))/2;
        return sum-total;
    }
}