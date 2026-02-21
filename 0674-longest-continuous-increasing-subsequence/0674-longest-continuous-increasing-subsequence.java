class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int curr=1;
        int best=0;
        for(int i=0;i<nums.length-1;i++){

            if(nums[i]<nums[i+1]){
                curr++;
            }
            else{
                best=Math.max(curr,best);
                curr=1;
            }

        }
        best=Math.max(curr,best);
        return best;
    }
}