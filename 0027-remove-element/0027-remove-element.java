class Solution {
    public int removeElement(int[] nums, int val) {
        List<Integer> list=new ArrayList<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                continue;
            }
            else{
                list.add(nums[i]);
                count++;
            }
        }
        int k=0;
        for(int i:list){
            nums[k++]=i;
        }
        return count;
    }
}