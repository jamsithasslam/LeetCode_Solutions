class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int candidate1=0;
        int candidate2=0;
        int count1=0;
        int count2=0;
        for(int num:nums){
            if(num==candidate1){
                count1++;
            }
            else if(num==candidate2){
                count2++;
            }
            else if(count1==0){
                candidate1=num; 
                count1=1;
            }
            else if(count2==0){
                candidate2=num; 
                count2=1;
            } 
            else{
                count1--;
                count2--;
            } 
        }
        int c1=0,c2=0;
        for(int num:nums){
            if(num==candidate1) c1++;
            else if(num==candidate2) c2++;
        }
        List<Integer> list=new ArrayList<>();
        if(c1>nums.length/3) list.add(candidate1);
        if(c2>nums.length/3) list.add(candidate2);
        return list;
    }
}