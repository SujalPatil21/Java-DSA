class Solution {
    public int numSub(String s) {

        long total = 0;
        long count = 0;
        int mod = 1_000_000_007;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '1') {
                count++;
            } else {
                total += count * (count + 1) / 2;
                count = 0;
            }
        }

        // Handle last streak
        total += count * (count + 1) / 2;

        return (int)(total % mod);
    }
}
