class Solution {
    public int reverse(int x) {
        if(x == Integer.MAX_VALUE || x == Integer.MIN_VALUE)
            return 0;
        boolean isNeg = x < 0;
        int abs = isNeg ? x * (-1) : x;
        int n = (int) Math.log10(abs) + 1;
        int res = 0;
        for(int i = 0; i < n && abs > 0; i++){
            res += ((abs % 10) * Math.pow(10, n - i - 1));
            abs /= 10;
        }
        if(res == Integer.MAX_VALUE || res == Integer.MIN_VALUE)
            return 0;
        return isNeg ? res * (-1) : res;
    }
}