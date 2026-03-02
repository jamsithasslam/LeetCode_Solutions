class Solution {
    public int firstMissingPositive(int[] nums) {
        int pos=1;
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,1);
        }

        for(int num:nums){
            if(!map.containsKey(pos)){
                return pos;
            }
            pos++;
        }
        return pos;
    }
}