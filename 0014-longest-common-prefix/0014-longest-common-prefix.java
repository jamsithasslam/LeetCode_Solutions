class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return "";
        if(strs.length==1) return strs[0];
        if(strs[0].isBlank()) return "";

        String first=strs[0];
        for(int i=0;i<first.length();i++){
            for(String str:strs){
                if(str.length()-1>=i&&first.length()-1>=i){

                
                    if(str.charAt(i)==first.charAt(i)){
                        continue;
                    }
                    else{
                        return first.substring(0,i);
                    }
                }
                else{
                    return first.substring(0,i);
                }   
            }
        }
        
        return first;
    }
}