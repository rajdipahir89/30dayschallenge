class GfG
{
    //Function to locate the occurrence of the string x in the string s.
    int strstr(String s, String x)
    {
       // Your code here
       int m=s.length();
       int n=x.length();
       for(int i=0;i<=m-n;i++)
       {
           int j=0;
           
           for( j=0;j<n;j++)
           {
               if(s.charAt(i+j)!=x.charAt(j)){
                   break;
                   
               }
           }
               if(j == n)
                   return i;
               
        }
       
       return -1;
       
    }
}