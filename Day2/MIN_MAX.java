//User function Template for Java


/*class pair  
{  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
} */

class Compute
{
    static pair getMinMax(long a[], long n)  
    {
        long min=Integer.MAX_VALUE;
        long max=Integer.MIN_VALUE;
        
        //Write your code here
        for(int i=0;i<n;i++)
        {
            if(min>a[i])
            {
                min=a[i];
            }
            if(max<a[i])
            {
                max=a[i];
            }
        }
        
      return new pair(min, max);  
    }
}