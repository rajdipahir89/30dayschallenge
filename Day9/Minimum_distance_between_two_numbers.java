
class Solution {
    int minDist(int a[], int n, int x, int y) {
        // code here
        int start=-1,end=-1,ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(x==a[i])
            {
                    start=i;
            }
            else if(y==a[i])
            {
                    end=i;
            }
            if(start!=-1 && end!=-1)
            {
                int dis=Math.abs(start-end);
                  ans = Math.min(ans,dis);
            }
          
        }
        if(ans==Integer.MAX_VALUE)
        {
            return -1;
        }
            return ans;
    }
}