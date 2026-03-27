class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list=new ArrayList<>();

        int left=0;
        int right=arr.length-k;
        while(left<right){
            int mid=(right+left)/2;

            if(x-arr[mid] <= arr[mid+k]-x){
                right=mid;
            }
            else{
                left=mid+1;
            }
        }

        for(int i=left;i<left+k;i++){
            list.add(arr[i]);
        }

        return list;
    }
}