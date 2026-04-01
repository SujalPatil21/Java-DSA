class Solution {
    public boolean check(int[] nums) {
    
        boolean value = true;
        int first = nums[0]; 

        for(int i = 0 ; i < nums.length - 1 ; i++){
           
            if(value == true){  
                if(nums[i] <= nums[i+1]){
                    value = true;
                }
                else{
                    value = false;
                }
            }
            else
            {   
                if(nums[i] > nums[i+1]){
                    return false;
                }
                if(nums[i+1] > first){
                    return false;   
                } 
            }
        }


        if(value == false && nums[nums.length - 1] > first){
            return false;
        }

        return true;
    }
}