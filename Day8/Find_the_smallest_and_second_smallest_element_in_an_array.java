class Compute 
{
    public long[] minAnd2ndMin(long a[], long n)  
    {
        long min=Integer.MAX_VALUE,min2=Integer.MAX_VALUE;
        
        for(int i=0;i<n;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]<min2 && a[i]>min)
            {
                    min2=a[i];
            }
        }
        if(min2==Integer.MAX_VALUE)
        {
            min=-1;
            min2=-1;
        }
       
        long arr[]=new long[2];
        arr[0]=min;
        arr[1]=min2;
        return arr;
    }
}