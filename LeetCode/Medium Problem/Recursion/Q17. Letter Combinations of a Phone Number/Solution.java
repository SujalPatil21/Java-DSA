class Solution {

    private final Map<Character, char[]> keyboard = Map.of(
        '2', new char[] { 'a', 'b', 'c' },
        '3', new char[] { 'd', 'e', 'f' },
        '4', new char[] { 'g', 'h', 'i' },
        '5', new char[] { 'j', 'k', 'l' },
        '6', new char[] { 'm', 'n', 'o' },
        '7', new char[] { 'p', 'q', 'r', 's' },
        '8', new char[] { 't', 'u', 'v' },
        '9', new char[] { 'w', 'x', 'y', 'z' }
    );
    public List<String> letterCombinations(String digits) {

        // Final answer list
        List<String> ans = new ArrayList<>();

        // Edge case
        if (digits.length() == 0) {
            return ans;
        }

        // Start recursion
        solve(digits, 0, "", ans);

        return ans;
    }

  
    public void solve(String digits, int index, String current, List<String> ans) {

        // Base condition
        if (index == digits.length()) {
            ans.add(current);
            return;
        }

        // Current digit
        char digit = digits.charAt(index);

        // Get corresponding letters
        char[] letters = keyboard.get(digit);

        // Try every letter
        for (char ch : letters) {

            // Add letter and move ahead
            solve(digits, index + 1, current + ch, ans);
        }
    }
}