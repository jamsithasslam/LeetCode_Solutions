class Solution {
    public int longestConsecutive(int[] arr) {
        int max=1;
        int n=arr.length;
        int curr=1;
        Arrays.sort(arr);
        if(n==0){
            return 0;
        }
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                continue;

            }
            else if(arr[i]==arr[i+1]-1){
                curr++;
            }
            else{
                curr=1;

            }
            max=Math.max(max,curr);
        }
        return max;
        
    }
}