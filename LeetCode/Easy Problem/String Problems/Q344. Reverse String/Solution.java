class Solution {
    public void reverseString(char[] s) {
        
        int first = 0;
        int last = s.length-1;

        while(first <=last){


            char temp = s[first];
            s[first] = s[last];
            s[last] = temp;
            first++;
            last--;
       
         } }
}