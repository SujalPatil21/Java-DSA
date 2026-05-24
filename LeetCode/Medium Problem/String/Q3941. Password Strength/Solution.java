class Solution {
    public int passwordStrength(String password) {

        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch = 'a'; ch <='z';ch++){
            map.put(ch,1);
        }
        for(char ch = 'A' ; ch <= 'Z' ; ch++){
            map.put(ch,2);
        }
        for(char ch  = '0' ; ch <= '9' ; ch++){
            map.put(ch,3);
        }
        map.put('!',5);
        map.put('@',5);
        map.put('#',5);
        map.put('#',5);
        map.put('$',5);
          HashSet<Character> set = new HashSet<>();
        int sum = 0;
        for(int i = 0 ; i < password.length() ; i++){
            char ch = password.charAt(i);
            
            if(!set.contains(ch)){
           sum += map.get(password.charAt(i));
                set.add(ch);
            }
            
        }
        return sum;
    }
}