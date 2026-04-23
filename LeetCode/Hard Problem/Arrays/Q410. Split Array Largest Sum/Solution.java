class Solution {
    public int splitArray(int[] nums, int k) {

        int high = 0;  
      for(int i = 0 ; i < nums.length ; i++){

         low = Math.max(low,nums[i]);
         high +=nums[i]; 

          
      while(low <= high){
   
        int mid = low + (high - low) / 2;

        int count = fun(nums,mid);  
     
            if(count >  k){
                low = mid + 1;
            }  
            else{

                high = mid - 1;
            }
      }
      return low;

    }

    public int fun(int[] nums,int mid){

        int arr = 1 ; 
        int sub = 0;

        for(int i = 0 ; i < nums.length ; i++){

            if(sub + nums[i] <=mid){

                sub += nums[i];
            }
            else{

                arr++;
                sub = nums[i];
            }
   
        }
         return arr;
    }
}