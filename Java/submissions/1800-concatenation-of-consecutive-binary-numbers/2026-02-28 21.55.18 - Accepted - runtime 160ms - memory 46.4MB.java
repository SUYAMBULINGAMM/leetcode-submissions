class Solution {
    public static final int mod=1_000_000_007;
    public int concatenatedBinary(int n) {
        long res=0;
        for(int i=1;i<=n;i++)
        {
            int binary=Integer.toBinaryString(i).length();
            res=((res << binary)+i) % mod;
        }
        return (int)res;
        
    }
}