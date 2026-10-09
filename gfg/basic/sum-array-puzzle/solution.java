class Solution {
    public void sumArray(int[] arr) {
        // code here
        int sum = 0;
        for(int val:arr){
            sum+=val;
        }
        for(int i = 0; i<arr.length; i++){
            arr[i]=sum-arr[i];
        }
    }
}