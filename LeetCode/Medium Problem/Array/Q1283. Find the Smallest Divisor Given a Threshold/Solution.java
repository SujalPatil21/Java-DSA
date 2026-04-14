class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        
        int max = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
          max =  Math.max(max,nums[i]);
        }

        int left = 1 ;
        int right = max;

        while(left < right){

            int mid = left + (right - left) / 2;

            int ans = findAns(nums,mid);

            if(ans <= threshold){

                right = mid;
            }
            else{

                left = mid + 1;
            }

        }
        return left;

    }

    public int findAns(int[] nums , int mid){

        int ans = 0;
        for(int i : nums){

           ans += (i + mid - 1) / mid;
        }
        return ans;
    }
}