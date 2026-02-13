class Solution {
    public int[] getConcatenation(int[] nums) {
       
        int arr[]=new int[nums.length*2];
        int j;
        for( j=0;j<nums.length;j++){
            arr[j]=nums[j];
            arr[j+nums.length]=nums[j];
        }
        // int k=0;
        // for(int i=j;i<arr.length;i++){
        //     arr[i]=nums[k++];
        // }
        return arr;
    
    }
}