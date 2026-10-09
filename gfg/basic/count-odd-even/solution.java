class Solution {
    public int[] countOddEven(int[] arr) {
        // Code here
        int odd = 0;
        int even = 0;
        for(int val:arr){
            if(val%2==0){
                even++;
            } else{
                odd++;
            }
        }
        return new int[]{odd,even};
    }
}