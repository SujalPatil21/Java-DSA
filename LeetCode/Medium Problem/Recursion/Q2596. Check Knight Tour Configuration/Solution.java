class Solution {
    public boolean checkValidGrid(int[][] grid) {

        return isValid(grid, 0, 0, grid.length, 0);
    }

    public boolean isValid(int[][] grid, int row, int col, int n, int expectedvalue) {

        if (row < 0 || col < 0 || row >= n || col >= n || grid[row][col] != expectedvalue) {
            return false;
        }
        if (expectedvalue == n * n - 1) {
            return true;
        }

        boolean ans1 = isValid(grid, row - 2, col + 1, n, expectedvalue + 1);
        boolean ans2 = isValid(grid, row - 1, col + 2, n, expectedvalue + 1);
        boolean ans3 = isValid(grid, row + 1, col + 2, n, expectedvalue + 1);
        boolean ans4 = isValid(grid, row + 2, col + 1, n, expectedvalue + 1);
        boolean ans5 = isValid(grid, row + 2, col - 1, n, expectedvalue + 1);
        boolean ans6 = isValid(grid, row + 1, col - 2, n, expectedvalue + 1);
        boolean ans7 = isValid(grid, row - 1, col - 2, n, expectedvalue + 1);
        boolean ans8 = isValid(grid, row - 2, col - 1, n, expectedvalue + 1);

        return ans1 || ans2 || ans3 || ans4 || ans5 || ans6 || ans7 || ans8;
    }
}