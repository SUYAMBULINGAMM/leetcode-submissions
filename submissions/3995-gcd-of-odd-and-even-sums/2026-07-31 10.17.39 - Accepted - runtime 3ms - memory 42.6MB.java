class Solution {
    public static int gcd(int a,int b)
    {
        if(b == 0) return a;
        return gcd(b,(a%b));
    }
    public int gcdOfOddEvenSums(int n) {
        int sumeven=0;
        int sumodd=0;
        for(int i=1;i<=n*2;i++)
        {
            if(i%2==0)
            {
                sumeven+=i;
            }
            else
            {
                sumodd+=i;
            }
        }
        int res=gcd(sumodd,sumeven);
        return res;
    }
}