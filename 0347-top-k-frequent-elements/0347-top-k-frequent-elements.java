class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map =new HashMap<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            
        }
        int arr[]=new int[k];
        int l=0;
        List<Map.Entry<Integer,Integer>> list=new ArrayList<>(map.entrySet());
        Collections.sort(list,(a,b)->b.getValue().compareTo(a.getValue()));
        
        for(Map.Entry<Integer,Integer> entry:list){
            if(k>0){
                arr[l++]=entry.getKey();
                k--;
            }
        }
        return arr;
    }

}