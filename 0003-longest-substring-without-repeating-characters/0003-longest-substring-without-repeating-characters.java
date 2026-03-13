class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength=0;
        int left=0;
        int right=0;

        while(right<s.length()){
            String sub=s.substring(left,right);
            if(sub.indexOf(s.charAt(right))==-1){
                maxLength=Math.max(maxLength,sub.length()+1);
            }
            else{
                left++;
                continue;
            }

            right++;

        }
        return maxLength;
    }

}