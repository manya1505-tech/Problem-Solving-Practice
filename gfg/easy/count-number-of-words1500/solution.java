class Solution {
    public int countWords(String s) {
        // code here
        s = s.trim();
        String[] words = s.split("\\s+");
        return words.length;
        
    }
}