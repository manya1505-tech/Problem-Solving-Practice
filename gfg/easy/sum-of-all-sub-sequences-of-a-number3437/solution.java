
class Solution {
    static final long MOD = 1000000007L;

    public int subsequenceSum(String s) {
        long sum = 0;

        for (int i = 0; i < s.length(); i++) {
            sum += s.charAt(i) - '0';
        }

        long power = modPow(2, s.length() - 1);

        return (int) ((sum * power) % MOD);
    }

    private long modPow(long base, int exp) {
        long result = 1;

        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * base) % MOD;
            }

            base = (base * base) % MOD;
            exp >>= 1;
        }

        return result;
    }
}

