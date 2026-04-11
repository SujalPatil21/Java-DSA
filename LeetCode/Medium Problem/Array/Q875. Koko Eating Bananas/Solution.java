class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int max = 0;
        for(int i = 0 ; i < piles.length ; i++){

            max = Math.max(max,piles[i]);
        }

        int left = 1;
        int right = max;
        while(left < right){

            int mid = left + (right - left) / 2;

            int totalHours = findHour(piles,mid); 
            if(totalHours <= h){
               
                right  = mid ;
            }
            else{

                left = mid + 1;
            }
        }
        return left;
    }

    public int findHour(int[] piles ,int mid){
         int totalHours = 0;
        for(int pile : piles){
         
          totalHours += (int)Math.ceil((double)pile / mid);
          
        } 
        return totalHours;
    }
}
    
