class Solution {
    public String reverseStr(String s, int k) {
        
        int left=0;
        
        char ch[]=s.toCharArray();
       while(left<s.length()){
            int right=Math.min(left+k-1,s.length()-1);
            reverse(ch,left,right);
            left=left+2*k;
            


       } 
       return new String(ch);
    }

    private void reverse(char ch[],int start,int end){
        while(start<end){
            char temp=ch[start];
            ch[start]=ch[end];
            ch[end]=temp;
            start++;
            end--;
        }
    }
}