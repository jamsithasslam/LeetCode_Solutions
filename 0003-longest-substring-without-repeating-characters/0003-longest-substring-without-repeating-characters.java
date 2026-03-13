class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int right=0;
        int largest=1;
        if(s.length()==0){
            return 0;
        }
        Set<Character> set = new HashSet<>();
        while(right<s.length()){
             
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                right++;
                largest=Math.max(largest,set.size());

            }
            else{
                set.remove(s.charAt(left));
                left++;
                
            }
            
            
            
        }
        
        return largest;
    }
}
