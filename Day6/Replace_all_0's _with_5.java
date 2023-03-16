
class GfG {
    int convertfive(int num) {
        // Your code here
        int rev=0;
        String str1 = Integer.toString(num);
    
        for(int i=0;i<str1.length();i++)
        {
            int temp=num%10;
            if(temp==0)
            {
                temp=5;
            }
            rev=(rev*10)+temp; 
            num=num/10;
        }
        
        int j=rev;
        int r=0;
         for(int i=0;i<str1.length();i++)
        {
            int temp=j%10;
            r=(r*10)+temp; 
            j=j/10;
        }
        
        return r;
    }
}