class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        
     
        int count = backtracking(nums,target,0);
        return count;
    }

    public int backtracking(int[] nums, int target , int index){

            
        if(index == nums.length){

            return target == 0 ? 1:0; //If else
        }

        int add = backtracking(nums , target + nums[index],index + 1); //add number
        int sub = backtracking(nums,target - nums[index],index+1);//subtract number 

        // when the index reaches nums
        return add+sub;
    }
}