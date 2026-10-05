class Solution {
    public String convertToCamelCase(String s) {
        // code here
        String[] str=s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        sb.append(str[0]);
        for(int i=1;i<str.length;i++){
        sb.append(Character.toUpperCase(str[i].charAt(0)));
        sb.append(str[i].substring(1));
        }
        return sb.toString();
    }
}