class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int sum = 0;
        int original = n;
        
        while(n!=0){
           int digit = n%10;
            sum = sum+digit*digit*digit;
            n=n/10;
        }
        if(original == sum){
         return true;   
        }
        return false;
    }
}