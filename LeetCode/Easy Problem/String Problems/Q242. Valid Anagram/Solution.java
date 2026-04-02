class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> word = new HashMap<>();
        if (s.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            word.put(ch, word.getOrDefault(ch, 0) + 1);
        }
        for (int j = 0; j < t.length(); j++) {
            char ch = t.charAt(j);
            if (!word.containsKey(ch)) {
                return false;
            }
            word.put(ch, word.get(ch) - 1);
            if (word.get(ch) == 0) {

                word.remove(ch);
            }
        }
        return true;
    }
}