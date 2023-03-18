class Solution
{
    int thirdLargest(int a[], int n)
    {
	    // Your code here
	    int max=Integer.MIN_VALUE,max2=Integer.MIN_VALUE,max3=Integer.MIN_VALUE;
	    
	    if(n==2)
	    {
	        return -1;
	    }
	    for(int i=0;i<n;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]>max2 && a[i]<max)
            {
                    max2=a[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]>max3 && a[i]<max2)
            {
                    max3=a[i];
            }
        }
        
        if(max3==Integer.MIN_VALUE)
        {
            max3=-1;
        }
       
        return max3;
    }
}
