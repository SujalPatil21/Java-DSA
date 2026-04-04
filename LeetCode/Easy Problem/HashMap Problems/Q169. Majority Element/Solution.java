class Solution {
    public int majorityElement(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();
       for(int i : nums){

            map.put(i,map.getOrDefault(i,0) + 1);
        }


        int majority = 0;
        int element = 0 ;
        for(int key : map.keySet()){
            if(majority < map.get(key)){
                
                majority = map.get(key);
                 element = key;
            }
            } 

        return element;
    }
}