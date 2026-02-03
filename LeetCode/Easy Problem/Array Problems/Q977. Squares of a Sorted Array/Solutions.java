class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i = 0 ; i < nums.length ; i++){
            nums[i] = nums[i] * nums[i];
        }
        for(int j = 0 ; j < nums.length ; j++){
            for(int k = 0 ; k < nums.length ; k++){
                if(nums[j] < nums[k]){

                    int temp = nums[j];
                    nums[j] = nums[k];
                    nums[k] = temp;
                }
            }
        }
        return nums;
    }
}