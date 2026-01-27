class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {

        ArrayList<Integer> target = new ArrayList<>();

        for(int i = 0 ; i < nums.length ;i++ ){

            target.add(index[i],nums[i]);
        }

        for(int j = 0 ; j < nums.length ; j++){

            nums[j] = target.get(j);
        }
        return nums;
    }
}