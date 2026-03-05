class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
        s=s.toLowerCase();
        String clean=s.replaceAll("[^a-z0-9]", "");
        int right=clean.length()-1;
        while(left<right){
            if(clean.charAt(left)!=clean.charAt(right)){
                return false;
            }
            left++;
            right--;

        }
        return true;

    }
}