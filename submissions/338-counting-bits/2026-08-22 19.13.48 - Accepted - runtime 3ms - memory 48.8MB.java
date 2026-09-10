class Solution {
    public int bitCount(int n)
    {
        int sum=0;
        while(n>0)
        {
            sum+=(n & 1);
            n>>=1;
        }
        return sum;
    }
    public int[] countBits(int n) {
        int ans[]=new int[n+1];
        for(int i=0;i<=n;i++)
        {
            ans[i]=bitCount(i);
        }
        return ans;
    }
}