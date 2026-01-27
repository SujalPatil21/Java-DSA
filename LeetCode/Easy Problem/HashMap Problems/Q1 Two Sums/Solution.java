class Solution {
    public int[] twoSum(int[] nums, int target) {


        HashMap<Integer,Integer> obj = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++){
            int number = target - nums[i];

            if(obj.containsKey(number)){

                return new int[]{obj.get(number),i};

            }

            obj.put(nums[i],i);

        }
        return new int[]{-1,-1};
    }


}