class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        
        
        
        Arrays.sort(nums);
        for(int left=0;left<nums.length-2;left++){
            if(left>0&&nums[left]==nums[left-1]) continue;
            int mid=left+1;
            int right=nums.length-1;
            while(mid<right){
                if(nums[left]+nums[mid]+nums[right]>0){
                    right--;
                }
                else if(nums[left]+nums[mid]+nums[right]<0){
                    mid++;
                }
                else{
                    list.add(Arrays.asList(nums[left],nums[mid],nums[right]));
                    
                    mid++;
                    right--;
                    // while(mid<right&&nums[mid]==nums[mid-1]) mid++;
                    // while(mid<right&&nums[right]==nums[right+1])right--;
                }
            }
        }
        return list;
    }
}