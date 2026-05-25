class Solution {
    public List<String> generateParenthesis(int n) {
      List<String> ans = new ArrayList<>();
      solve("",0,0,n,ans);
      return ans;  
    }

    private void solve(String current , int open , int close , int total , List<String> ans ){

        if(current.length() == 2 * total ){
           ans.add(current);
            return ;
        }

        if(open < total){

            solve(current+"(" , open + 1 , close , total , ans);
        }
        if(close < open ){
            solve(current+")" , open , close + 1 , total , ans);
        }
    }
}