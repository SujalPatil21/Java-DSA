class Solution {
    public boolean halvesAreAlike(String s) {

      s = s.toLowerCase();
    
        int s1_count = 0;

        int n = s.length() / 2;
        for(int i = 0 ; i < n ; i++){

            if(isVowel(s.charAt(i))){

                s1_count++;
            }
        }
        int s2_count = 0;
        for(int j = n ; j < s.length(); j++ ){

           if(isVowel(s.charAt(j))){

            s2_count++;
           }
            
        }

        if(s1_count==s2_count){

            return true;
        }

        return false; 
    }
         private boolean isVowel(char c){

             return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c=='u';
         }

    
}