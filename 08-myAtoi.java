//STRING TO INTEGER
class Solution {
    public int myAtoi(String s) {
        int idx = 0, sign = 1, result = 0;
        int n = s.length();
        while (idx < n && s.charAt(idx) == ' ') {
            idx++;
        }
        if (idx < n && (s.charAt(idx) == '-' || s.charAt(idx) == '+')) {
            sign = (s.charAt(idx++) == '-') ? -1 : 1;
        }
        while (idx < n && s.charAt(idx) >= '0' && s.charAt(idx) <= '9') {
            //convert char into into => ch-'0'
            int digit = s.charAt(idx) - '0';
            //check overflow
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result * 10 + digit;
            idx++;
        }
        return result * sign;
    }
}
