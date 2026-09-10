class Solution {
    public static final int mod=1_000_000_007;
    public int concatenatedBinary(int n) {
        long res=0;
        int length=0;
        for(int i=1;i<=n;i++)
        {
            // int binary=Integer.toBinaryString(i).length();
            if((i & (i-1)) == 0)
            {
                length++;
            }
            res=((res << length)+i) % mod;
        }
        return (int)res;
        
    }
}