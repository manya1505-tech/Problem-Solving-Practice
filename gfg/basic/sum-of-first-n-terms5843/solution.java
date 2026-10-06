class Solution {
    int sumOfSeries(int n) {
        // code here
        //return(n*(n+1)/2)*(n*(n+1)/2);
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum = sum + i*i*i;
        }
        return sum;
    }
}