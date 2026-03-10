class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int maximumArea=0;
        while(left<right){
            int minHeight=Math.min(height[left],height[right]);
            int currArea=minHeight*(right-left);

            while(left<right && height[left]<=minHeight){
                left++;
            }
            while(left<right && height[right]<=minHeight){
                right--;
            }
            maximumArea=Math.max(currArea,maximumArea);

        }
        return maximumArea;
    }
}