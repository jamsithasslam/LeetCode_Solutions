class Solution {
    public void sortColors(int[] nums) {
        int low=0;
       
        int high=nums.length-1;
        for(int mid=0;mid<=high;mid++){
            switch(nums[mid]){
                case 0:
                    swap(nums,low,mid);
                    low++;
                    break;
                
                case 2:
                    swap(nums,mid,high);
                    high--;
                    mid--;
                    break;
            }
        }
    }
    void swap(int nums[],int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}