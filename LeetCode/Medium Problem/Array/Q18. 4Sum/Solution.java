class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0 ; i < nums.length ; i++){
            
            if(i > 0 && nums[i] == nums[i-1])continue;
            for(int j = i + 1 ; j < nums.length ; j++){
                
                if(j > i + 1 && nums[j] == nums[j-1]) continue;
                   int k = j+1;
                   int p = nums.length - 1;

                   while(k < p){


                 long sum = (long) nums[i] + nums[j] + nums[k] + nums[p];

                    if(sum < target){
                        
                        k++;
                    }
                    else if(sum > target){

                        p--;
                    }

                    else{

                        List<Integer> list = new ArrayList<>();

                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        list.add(nums[p]);
                        result.add(list);
                        k++;
                        p--;

                    while(k < p && nums[k] == nums[k-1]) k++;
                    while(k < p && nums[p] == nums[p+1]) p--;
                    }
                }
            }
        }
        return result;
    }
}