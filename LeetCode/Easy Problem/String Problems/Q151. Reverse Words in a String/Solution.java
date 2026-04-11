class Solution {
    public String reverseWords(String s) {
        
        StringBuilder s1 = new StringBuilder();
        int end = s.length() - 1;

        for (int i = s.length() - 1; i >= 0; i--) {

            if (s.charAt(i) == ' ') {

              
                if (i + 1 <= end) {
                    s1.append(s.substring(i + 1, end + 1)).append(" ");
                }

                end = i - 1;
            }
        }

       
        if (end >= 0) {
            s1.append(s.substring(0, end + 1));
        }

        return s1.toString().trim();
    }
}