class Solution {
    public int largestAltitude(int[] gain) {
        int largest = 0;
        int sum = 0;
        for(int i = 0 ; i < gain.length ; i++){
            sum = sum+ gain[i];
            largest = Math.max(largest,sum);
        }
        return largest;
    }
}