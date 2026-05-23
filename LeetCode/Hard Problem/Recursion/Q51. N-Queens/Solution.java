class Solution {
    public List<List<String>> solveNQueens(int n) {

        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        List<List<String>> ans = new ArrayList<>();

        nQueens(board, 0, n, ans);
        return ans;
    }

    public void nQueens(char[][] board, int row, int n, List<List<String>> ans) {

        if (row == n) {

            List<String> temp = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                temp.add(new String(board[i]));
            }

            ans.add(temp);
            return;
        }
        for (int j = 0; j < n; j++) {

            if (isSafe(board, row, j, n)) {
                board[row][j] = 'Q';
                nQueens(board, row + 1, n, ans);
                board[row][j] = '.';
            }
        }
    }

    public boolean isSafe(char[][] board, int row, int col, int n) {
        //row check
        for (int i = 0; i < n; i++) {

            if (board[row][i] == 'Q') {

                return false;
            }
        }
        //column check
        for (int i = 0; i < n; i++) {

            if (board[i][col] == 'Q') {
                return false;
            }
        }
        //Diagonal left
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {

            if (board[i][j] == 'Q') {
                return false;
            }
        }
        //Diagonal right
        for (int i = row, j = col; i >= 0 && j < n; i--, j++) {

            if (board[i][j] == 'Q') {
                return false;
            }

        }
        return true;
    }
}