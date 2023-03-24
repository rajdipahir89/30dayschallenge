//User function Template for Java
class Solution 
{ 
    int findLength(String s) 
    { 
        // code here
    
        int length = 0;
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i)!=' '){
                length++;
            }
            else{
                if(length>0){
                    return length;
                }
            }
        }
        return length;
    }
}