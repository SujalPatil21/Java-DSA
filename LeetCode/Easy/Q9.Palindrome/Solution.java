class Solution {
    public boolean isPalindrome(int x) {

        int number =x;
        int reverse = 0;

        if(x<0){
            return false;
        }

        while(x!=0){

            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x = x /10;
        }
        return reverse==number;
    }
}