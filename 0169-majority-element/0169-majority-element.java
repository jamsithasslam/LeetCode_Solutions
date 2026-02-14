class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int candidate=nums[0];
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==candidate){
                count++;
            }
            else{
                count--;
            }
            if(count<=0){
                candidate=nums[i];
            }
        }
        int z=0;
        for(int x:nums){
            if(x==candidate){
                z++;
            }
        }
        if(z>nums.length/2)
            return candidate;
        else
            return -1;
    }
}