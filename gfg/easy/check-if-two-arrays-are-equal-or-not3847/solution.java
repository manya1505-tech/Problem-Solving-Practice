class Solution {
    public boolean checkPermutation(int[] a, int[] b) {
        // code here
        Arrays.sort(a);
        Arrays.sort(b);
        int n=a.length;
        for(int i =0; i<n; i++){
            if(a[i]!=b[i]){
                return false;
            }
        }
        return true;
    }
}