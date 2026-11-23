
class Solution {
    public char posInfinite(String s, int pos) {
        long p = pos;
        long len = s.length();

        // Find the expansion level containing the position
        long[] lengths = new long[50];
        long[] steps = new long[50];

        int count = 0;
        lengths[0] = len;

        while (len < p) {
            long step = count + 1;
            steps[count] = step;
            len = 2 * len + step;
            count++;
            lengths[count] = len;
        }

        // Trace the position backwards
        while (count > 0) {
            long oldLen = lengths[count - 1];
            long step = steps[count - 1];

            if (p <= oldLen) {
                count--;
            } 
            else if (p <= oldLen + step) {
                return '$';
            } 
            else {
                p = 2 * oldLen + step - p + 1;
                count--;
            }
        }

        return s.charAt((int) p - 1);
    }
}

