class Solution {
    public String longestPalindrome(String s) {
        int start=0;
        int maxLen=0;
        for(int i=0;i<s.length();i++){
            
            int odd=expand(i,i,s);
            int even=expand(i,i+1,s);
            int len=Math.max(odd,even);
            if(len>maxLen){
                maxLen=len;
                start=i-(maxLen-1)/2;

            }
        }
        return s.substring(start,start+maxLen);
    }

    private int expand(int left,int right,String s){
        while(left>=0&& right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return (right-1)-(left+1)+1;
    }
}