class Solution {
    public boolean isPower(int x, int y) {
        // code here
        for(int i=0; i<= 30; i++){
            if(Math.pow(x,i) == y){
                return true;
            }
        }
        return false;
    }
}