class Solution {
    public int removeElement(int[] nums, int val) {
       int last=nums.length-1;
       int start=0;
       while(start<=last){
            if(nums[last]==val){
                last--;
            }
            else if(nums[start]==val){
                int temp=nums[start];
                nums[start]=nums[last];
                nums[last]=temp;
                last--;
            }
            
            else{
                start++;
            }
            
       }
       return start;
    }
}