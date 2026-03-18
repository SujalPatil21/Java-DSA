class Solution {
    public int maxArea(int[] height) {

        int left = 0 ; 
        int right = height.length - 1;
        int largest_area = 0;
        while(left < right){

            int width = right - left;

            int length = Math.min(height[left],height[right]);

            int area = width * length;
            largest_area = Math.max(largest_area,area);

            if(height[left] < height[right] || height[left] == height[right]){

                left++;
            }
            else{

                right--;
            }

        }
        return largest_area;
    }
}