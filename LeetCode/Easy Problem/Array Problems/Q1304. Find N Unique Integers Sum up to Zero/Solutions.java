class Solution {
    public int[] sumZero(int n) {

        int[] nums = new int[n];
        if(n == 1){

            return nums;
        }

        int j = 1;
        for(int i = 0 ; i < n ; i++){

            if(n % 2==0){

                nums[i] = -j;
                nums[j] = j;
                j+=2;
                i++;
                if( j >= nums.length){

                    break;
                }

            }
            else{

                nums[i] = -j;
                nums[j] = j;
                j+=2;
                i++;
                if( j >= nums.length){

                    nums[nums.length-1] = 0;
                    break;
                }
            }

        }
        return nums;
    }

}