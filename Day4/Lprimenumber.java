// Leet code "Check number is prime or not"
class Solution {
    public boolean isPalindrome(int x) {
        int rev=0,n;
        n=x;
        while(x>0)
        {
            int temp = x % 10;
            rev=(rev*10)+temp;
            x=x/10;
        }

        if(n==rev)
        {
            return true;
        }
            return false;
    }
}