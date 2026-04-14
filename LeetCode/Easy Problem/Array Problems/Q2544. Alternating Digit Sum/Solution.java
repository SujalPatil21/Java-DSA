class Solution {
    public int alternateDigitSum(int n) {
        
        int sum = 0 ;
        int length = String.valueOf(Math.abs(n)).length();
        int[] nums = new int[length];
        int k = length - 1;

        while(n > 0){
       
            int digit = n % 10 ;
            nums[k] = digit ;
            n /=10;
            k--;
        }

        for(int i = 0 ; i < nums.length ; i++){


            if(i % 2 ==0){
                
                sum+=nums[i]; 
            }
            else{

                sum -=nums[i];
            }

        }   

        return sum;     
    }
}