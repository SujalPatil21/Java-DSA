class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int[] ans;
        ArrayList<Integer> list = new ArrayList<>();

        int i = num.length -1;
        while(i>=0 || k > 0 ){

            if(i >=0 ){
                k += num[i];
                i--;
            }

            int digit = k % 10;
            k /= 10;
            list.add(0,digit);
        }
        return list;
    }
}