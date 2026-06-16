class Solution {
    public String processStr(String s) {
        StringBuilder result = new StringBuilder();
        
        for (char ab : s.toCharArray()) {
            if (ab >= 'a' && ab <= 'z') {
                result.append(ab);
            } else if (ab == '*') {
                if (result.length() > 0) {
                    result.deleteCharAt(result.length() - 1);
                }
            } else if (ab == '#') {
                result.append(result.toString());
            } else if (ab == '%') {
                result.reverse();
            }
        }
        
        return result.toString();
    }
}