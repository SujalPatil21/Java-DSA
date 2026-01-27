class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int rows = image.length;
        int columns = image[0].length;

        for(int i = 0 ; i < rows ; i++){

            int start = 0;
            int end = columns-1;

            while(start <= end){

                int temp = image[i][start];
                image[i][start] = 1 - image[i][end];
                image[i][end] = 1 - temp;
                start++;
                end--;
            }
        }
        return image;
    }
}