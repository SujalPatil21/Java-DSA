class Solution {
    public int shipWithinDays(int[] weights, int days) {
        
        int maximum_capacity = 0;
        int minimum_capacity = 0;
        
        for(int i = 0; i < weights.length ; i++){

            maximum_capacity += weights[i];
            minimum_capacity = Math.max(minimum_capacity,weights[i]);
        }

        int left = minimum_capacity;
        int right = maximum_capacity;
        
        while(left <= right){


            int  mid = left + (right - left) / 2 ;

            int reqDay = fun(mid,weights);

            if(reqDay <= days){

                right = mid - 1;
            }
            else{
                
                left = mid + 1;
            }
        }
       return left;
    }

    public int fun(int mid , int[] weights){

        int days = 1;
        int load = 0;

        for(int i = 0 ; i < weights.length ; i++){


            if(load+weights[i] > mid){

                days++;
                load = weights[i];
            }
            else{
                load +=weights[i];
            }

            
        }
        return days;
    }
}