class Solution {
    public int pivotIndex(int[] nums) {

        int total_sum = 0;
        for(int i = 0 ;i < nums.length;i++){


            total_sum = total_sum+nums[i];
        }

        int left_sum = 0;
        for(int j = 0 ; j < nums.length ; j++){


            int right_sum = total_sum -left_sum - nums[j];

            if(right_sum ==left_sum){

                return j;
            }

            left_sum += nums[j];
        }

        return -1;
    }
}