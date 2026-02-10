class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        

        StringBuilder s1 = new StringBuilder(); 
        StringBuilder s2 = new StringBuilder();

        for(String x : word1){

            s1.append(x);
        }
        for(String b : word2){

            s2.append(b);
        }

        if(s1.toString().equals(s2.toString())){

            return true;
        }

    return false;
    }
}