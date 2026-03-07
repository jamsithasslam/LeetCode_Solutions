class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb=new StringBuilder();
        int left=0;
        int right=0;
        while(left<word1.length() && right<word2.length()){
            sb=sb.append(word1.charAt(left++)).append(word2.charAt(right++));
        }
        
        if(left<word1.length()){
            sb=sb.append(word1.substring(left));
        }
        else if(right<word2.length()){
            sb=sb.append(word2.substring(right));
        }
        return sb.toString();
    }
}