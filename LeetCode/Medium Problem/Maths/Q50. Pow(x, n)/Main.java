class Solution {
    public double myPow(double x, int n) {

    long BinForm =Math.abs((long)n); 
    double ans = 1;
    
    while(BinForm > 0){

        if(BinForm % 2 == 1){

            ans *= x;
        }

        x *=x;
        BinForm/=2;
    }

    return n < 0 ? 1 / ans : ans;
    }
}  
               

        
        