
class Solution{
	int [] lexicographicallyLargest(int [] a, int n) {
		//Write your code here
		int count=0;
            int c=2;
            for(int i=0;i<n-1;)
            {
                if((a[i]+a[i+1])%2==0)
                {
                    if(a[i]<a[i+1])
                    {
                        int tmp = a[i];
                        a[i] = a[i+1];
                        a[i+1] = tmp;
                        // swap(a[i],a[i+1]);
                        if(i!=0)
                        {
                            i--;
                        }
                    }
                    else
                    {
                        i++;
                    }
                }
                else
                    i++;
            }
            return a;
	}
}