
class Solution {
    public char nthCharacter(int n) {
        long pos = n;
        long digits = 1;
        long count = 9;
        long start = 1;

        while (pos > digits * count) {
            pos -= digits * count;
            digits++;
            count *= 10;
            start *= 10;
        }

        long number = start + (pos - 1) / digits;
        int index = (int) ((pos - 1) % digits);

        return String.valueOf(number).charAt(index);
    }
}
