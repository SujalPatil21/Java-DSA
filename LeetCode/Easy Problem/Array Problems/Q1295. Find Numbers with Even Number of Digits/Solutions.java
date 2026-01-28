class Solution {
    public int findNumbers(int[] nums) {


        int count = 0;
        for(int i = 0 ; i < nums.length ; i++){

            int digit_count = 0 ;

            int number = nums[i]; // 12.0

            if(number == 0){

                digit_count = 1;
            }

            while(number!=0){ //pass

                number = number / 10 ;

                digit_count++;


            }
            if(digit_count % 2 == 0 ){
                count++;
            }
        }
        return count;
    }
}   