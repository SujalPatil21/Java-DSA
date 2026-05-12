class Solution {

    public List<List<Integer>> permute(int[] nums) {
        ArrayList<List<Integer>> ans = new ArrayList<>();
         per(nums,0,ans);
         return ans;
    }

    public void per(int[] nums , int index , ArrayList<List<Integer>> ans){

        if(index == nums.length ){

            ArrayList<Integer> temp = new ArrayList<>();
            for(int i = 0 ; i < nums.length ; i++){
            temp.add(nums[i]);
            }
            ans.add(temp);  
            return;
        }

        for(int i = index ; i < nums.length ; i++){

                swap(nums,i,index);
                per(nums,index+1,ans);
                swap(nums,i,index);
        }
    } 


    public void swap(int[] arr , int i , int j){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}