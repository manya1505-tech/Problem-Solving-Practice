// class Solution {
//     public boolean isPalindrome(int n) {
//         // code here
//         int original = Math.abs(n);
//         int rev = 0;
//         while(n>0){
//             int digit = n%10;
//             rev = rev*10 + digit;
//             n = n/10;
//         }
//         if(rev == original){
//             return true;
//         }
//         return false;
//     }
// }
class Solution {
    public boolean isPalindrome(int n) {

        int original = Math.abs(n);
        int rev = 0;

        n = Math.abs(n);

        while(n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }

        if(rev == original) {
            return true;
        }

        return false;
    }
}