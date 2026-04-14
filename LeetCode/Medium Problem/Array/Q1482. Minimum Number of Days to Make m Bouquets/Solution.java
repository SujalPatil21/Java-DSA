class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

        long n = (long) bloomDay.length;
        long p = (long) m * k;

        if (n < p) {

            return -1;
        }
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < bloomDay.length; i++) {

            max = Math.max(bloomDay[i], max);
            min = Math.min(bloomDay[i], min);
        }
        
        int start = min;
        int end = max;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (possible(bloomDay, mid, m, k)) {

                end = mid - 1;
            } else {

                start = mid + 1;
            }
        }
        return start;
    }
    
    //If possible here we check if the given days(mid) can give the m number of boquets

    public boolean possible(int[] bloomDay, int mid, int m, int k) {

        int count = 0;
        int bouquets = 0;
        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] <= mid) {

                count++;

            } else {
                bouquets += (count / k);
                count = 0;
            }
        }
        bouquets += (count / k);
        return bouquets >= m;
    }
}