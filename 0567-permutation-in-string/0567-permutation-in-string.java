class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int s1Count[]=new int[26];
        int window[]=new int[26];

        int k=s1.length();

        for(int i=0;i<k;i++){
            s1Count[s1.charAt(i)-'a']++;
        }

        for(int j=0;j<s2.length();j++){
            window[s2.charAt(j)-'a']++;

            if(j>=k){
                window[s2.charAt(j-k)-'a']--;
            }
            if(Arrays.equals(s1Count,window)){
                return true;
            }
        }
        return false;
    }
}