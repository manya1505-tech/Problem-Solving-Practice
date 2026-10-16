class Solution {
    public ArrayList<Integer> sumTriangles(int mat[][]) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int n = mat.length;
        int upperSum = 0;
        int lowerSum=0;
        for(int i = 0; i<n;i++){
            for(int j = i; j<n; j++){
                upperSum += mat[i][j];
            }
        }
        for(int i =0;i<n;i++){
            for(int j = 0;j<=i;j++){
                lowerSum += mat[i][j];
            }
        }
        ans.add(upperSum);
        ans.add(lowerSum);
        return ans;
    }
}