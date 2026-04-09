class Solution {
    public int maxProduct(int[] nums) {
        

        int prefix = 1;
        int suffix = 1;

        if(nums[0] < 0 && nums.length == 1 ){

            return nums[0];
        }
        int max_product =0;
        for(int i = 0 ; i < nums.length ;i++){

            if(nums[i] == 0){

                prefix = 1;
            }
            else{
            prefix *= nums[i];
            max_product = Math.max(prefix,max_product);
            }
        }
                for(int i = nums.length - 1 ; i >0 ;i--){

            if(nums[i] == 0){

                suffix = 1;
            }
            else{
            suffix *= nums[i];
            max_product = Math.max(suffix,max_product);
            }
           
        }
         return max_product;
    }
}