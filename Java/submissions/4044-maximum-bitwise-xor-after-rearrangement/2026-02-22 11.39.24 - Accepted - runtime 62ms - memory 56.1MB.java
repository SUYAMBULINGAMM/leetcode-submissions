class Solution {
    public String maximumXor(String s, String t) {

        String str = t;

        int ones = 0, zeros = 0;
        for (char c : str.toCharArray()) {
            if (c == '1') ones++;
            else zeros++;
        }

        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == '1') {
                if (zeros > 0) {
                    sb.append('1'); 
                    zeros--;
                } else {
                    sb.append('0');
                    ones--;
                }
            } else {
                
                if (ones > 0) {
                    sb.append('1'); 
                    ones--;
                } else {
                    sb.append('0');
                    zeros--;
                }
            }
        }

        return sb.toString();
    }
}