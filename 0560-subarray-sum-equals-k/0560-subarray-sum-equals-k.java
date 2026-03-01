class Solution {
    public int subarraySum(int[] nums, int k) {
       int left=0;
       int right=0;
       int count=0;
       int sum=0;
       while(left<nums.length){
        while(right<nums.length){
            sum+=nums[right];
            right++;
            if(sum==k){
            count++;
        }
        }
        
        sum=0;
        left++;
        right=left;

       }
       return count;
    }
}