class Solution {
    public int findDuplicate(int[] nums) {
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int x : nums){

            map.put(x,map.getOrDefault(x,0)+1);
        }

        for(int key : map.keySet()){

            if(map.get(key) > 1){

                return key;
            }
        }
        return -1;

    }
}