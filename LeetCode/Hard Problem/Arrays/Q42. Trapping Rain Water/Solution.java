class Solution {
    public int trap(int[] height) {
        
        int[] suffix = new int[height.length ];
        suffix[height.length-1] = height[height.length-1];
        for(int i = height.length - 2 ; i >= 0; i--){
            suffix[i] = Math.max(height[i],suffix[i+1]);;

        }
        int[] prefix = new int[height.length];
        prefix[0] = height[0];
        for(int i = 1 ; i < height.length ; i++){

            prefix[i] = Math.max(height[i],prefix[i-1]);
        }

        int total = 0 ;
        
        for(int i = 0 ; i < height.length; i++){
            
             total += Math.min(prefix[i] ,suffix[i]) - height[i]; 

             if(total < 0){
                total = 0;
             }
        }

        return total;
        
    }


}