class Solution {
    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);  

        int closest = nums[0] + nums[1] + nums[2];
        for(int i = 0 ; i < nums.length ;i++){


            int j = i+1;
            int k = nums.length - 1;

            while(j < k){

                int sum = nums[i] + nums[j] + nums[k];
                
                int d1 = sum - target;
                int d2 = closest - target;

                if((d1*d1) < (d2*d2)){

                    closest = sum;
                }

                if(sum < target){

                    j++;
                }
                else if(sum > target){

                    k--;
                }

                else{
                    return sum;
                }
            }
        }

        return closest;
    }
}