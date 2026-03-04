class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            int currIndex=0;
            while(nums[i]>0 && nums[i]<=n &&nums[nums[i]-1]!=nums[i]){
                currIndex=nums[i]-1;

                int temp=nums[i];
                nums[i]=nums[currIndex];
                nums[currIndex]=temp;
            }
            
        }

        for(int i=0;i<n;i++){
            if(nums[i]!=i+1){
                return i+1;
            }
        }
        return n+1;
    }
}