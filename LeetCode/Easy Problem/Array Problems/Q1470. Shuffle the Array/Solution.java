class Solution {
    public int[] shuffle(int[] nums, int n) {

        int[] ans =new int[nums.length];
        int k = 0;
        int j = n;
        for(int i = 0 ; i < n ; i++ ){

            ans[k] = nums[i];
            ans[k+1] = nums[j];
            j++;
            k+=2; 
        }
        return ans;
    }
}
