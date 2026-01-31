class Solution {
    public int missingNumber(int[] nums) {

        int n = nums.length;
        int number = -1;
        boolean found = true;

        for(int i = 0 ; i <= n ; i++){

            for(int j = 0 ; j < n ; j++){

                if( i == nums[j]){

                    found = true;
                    break;
                }

                else{

                    found = false;
                }
            }

            if(found == false){


                return i;
            }
        }

        return number;

    }
}