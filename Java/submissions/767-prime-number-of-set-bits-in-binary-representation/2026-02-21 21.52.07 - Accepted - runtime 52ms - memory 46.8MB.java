class Solution {
    public int binaryset(String s)
    {
        int res=0;;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == '1')
            {
                res++;
            }
        }
        return res;
    }
    public boolean isprime(int n)
    {
        if(n==1) return false;
        else
        {
            for(int i=2;i*i<=n;i++)
            {
                if(n%i==0)
                {
                    return false;
                }
            }
            return true;
        }
    }
    public int countPrimeSetBits(int left, int right) {
        int c=0;
        for(int i=left;i<=right;i++)
        {
            String bin=Integer.toBinaryString(i);
            int set=binaryset(bin);
            if(isprime(set))
            {
                c++;
            }
        }
        return c;
    }
}