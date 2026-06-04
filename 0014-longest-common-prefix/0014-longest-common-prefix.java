class Solution {
    public String longestCommonPrefix(String[] strs) {
        String string=strs[0];
        for(String s:strs){
            while(!s.startsWith(string)){
                string=string.substring(0,string.length()-1);
            }
        }
        if(string.isEmpty()){
            return "";
        }

        return string;
    }
}