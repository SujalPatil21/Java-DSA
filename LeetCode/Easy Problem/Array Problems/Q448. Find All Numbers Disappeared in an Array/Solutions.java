class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for(int x : nums){

            set.add(x);
        }

        for(int i = 1 ; i <= nums.length ; i++){

            if(!set.contains(i)){

                list.add(i);
            }
        }
        return list;
    }
}