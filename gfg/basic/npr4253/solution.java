class Solution {
    public long nPr(int n, int r) {
        // code here
        long ans = 1;
        for(int i = 0; i< r; i++){
            ans = ans * (n-i);
        }
        return ans;
    }
}