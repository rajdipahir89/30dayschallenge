
//User function Template for Java
class Solution {

        // code here
        static String isSumOfTwo(int N){
        int first = 1;
        int second = N-1;
        String ans = "";
       while(true){
           if(isPrime(first) && isPrime(second)){
               ans = "Yes";
               break;
           }
           if(first>=second){
               ans = "No";
               break;
           }
           first++;
           second--;
       }
       return ans;
    }
    static boolean isPrime(int N ){
        if(N<2){
            return false;
        }
        for(int i=2; i<=Math.sqrt(N); i++){
            if(N%i==0){
                return false;
            }
        }
        return true;
    }
    
}