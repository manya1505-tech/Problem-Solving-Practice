

class Solution {
    public boolean findPattern(String s) {
        int i = 0;
        int n = s.length();

        while (i < n) {
            int countX = 0;
            int countY = 0;

            while (i < n && s.charAt(i) == 'x') {
                countX++;
                i++;
            }

            if (countX == 0) {
                return false;
            }

            while (i < n && s.charAt(i) == 'y') {
                countY++;
                i++;
            }

            if (countX != countY) {
                return false;
            }
        }

        return true;
    }
}
