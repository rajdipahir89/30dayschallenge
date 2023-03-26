class Solution {
    static String isKrishnamurthy(int N) {
        // code here
        int res = 0;
       int num = N;
       while(num>0){
           int  fact = 1;
         int rem = num%10;
          for(int i = 1; i<=rem;i++)
           {
               fact = fact*i;
           }
           res= res+fact;
           num = num/10;
       }
       if(res == N)
       {
            return "YES";
       }
       else
       {
         return "NO";
       }
    }
};