class Solution {
    public long decimalEquivalent(String n, int b) {
        long result = 0;

        for (int i = 0; i < n.length(); i++) {
            char ch = n.charAt(i);
            int digit;

            if (ch >= '0' && ch <= '9') {
                digit = ch - '0';
            } else {
                digit = ch - 'A' + 10;
            }

            result = result * b + digit;
        }

        return result;
    }
}