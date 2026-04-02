class Solution {
    public int singleNumber(int[] nums) {

        int Xor = 0;

        for(int n : nums){

            Xor ^= n;
        }

        return Xor;
        
    }
}