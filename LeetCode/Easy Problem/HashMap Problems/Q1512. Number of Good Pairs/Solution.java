class Solution {
    public int numIdenticalPairs(int[] nums) {

        int count = 0 ;
        HashMap<Integer,Integer> obj = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++) {


            int prev = obj.getOrDefault(nums[i],0);

            count = count+prev;
            obj.put(nums[i],prev+1);

        }
        return count;
    }
}