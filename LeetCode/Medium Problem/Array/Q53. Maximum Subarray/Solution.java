class Solution {
    public int maxSubArray(int[] nums) {
        
        long max_count =  nums[0];


        long sum = 0;
        for(int i = 0 ; i < nums.length ; i++){

            sum += nums[i];
            max_count = Math.max(sum,max_count);
            if(sum < 0){
                sum = 0;
            }
          
        }

        return (int)max_count;
    }
}