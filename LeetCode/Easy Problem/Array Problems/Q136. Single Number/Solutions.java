class Solution {
    public int singleNumber(int[] nums) {

        boolean value = true;
        int number = nums[0];

        if(nums.length == 1){

            return number;
        }

        for(int i = 0 ; i < nums.length ;i++){

            for(int j = 0 ; j <= nums.length-1;j++){

                if(i == nums.length -1 && j == nums.length-1){

                    break;
                }

                if( i == j ){

                    j = i+1;
                }


                if(nums[i] == nums[j]) {

                    value = true;
                    break;
                }
                else{
                    value = false;
                }
            }

            if(value == false){

                number = nums[i];
                return number;
            }
        }
        return number;
    }
}