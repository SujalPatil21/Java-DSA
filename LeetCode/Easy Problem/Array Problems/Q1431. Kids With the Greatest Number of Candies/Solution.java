class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int Max_Candy = candies[0];
        for(int i = 0 ; i <candies.length ; i++){

            Max_Candy = Math.max(Max_Candy,candies[i]);
        }

        List<Boolean> result = new ArrayList<>();

        for(int j = 0 ; j < candies.length ; j++){

            int ans = candies[j] + extraCandies;
            if(ans >=Max_Candy){

                result.add(true);
            }
            else{
                result.add(false);
            }

        }
        return result;
    }
}