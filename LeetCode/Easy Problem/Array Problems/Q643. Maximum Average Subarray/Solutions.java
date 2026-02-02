class Solution {
    public double findMaxAverage(int[] nums, int k) {


        double sum = 0;
        for(int i = 0 ; i < k ; i++){

            sum+=nums[i];
        }
        double Max_Average = sum;
        for(int j = k ; j < nums.length ; j++ ){

            sum +=nums[j];
            sum -= nums[j-k];

            Max_Average = Math.max(sum,Max_Average);
        }

        return Max_Average / k ;
    }
}