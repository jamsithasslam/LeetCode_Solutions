class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> list = new HashSet<>();
        for(int element:nums){
            if(!list.add(element)){
                return true;
            }
            list.add(element);
        }
        return false;
    }
}