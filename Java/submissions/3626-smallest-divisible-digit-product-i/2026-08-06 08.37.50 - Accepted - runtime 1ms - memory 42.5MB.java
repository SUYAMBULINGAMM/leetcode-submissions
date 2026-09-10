class Solution {
    public int rek(int n)
    {
        int x=1,t=n;
        while(t>0)
        {
            int d=t%10;
            x*=d;
            t/=10;
        }
        return x;

    }
    public int smallestNumber(int n, int t) {
        
        while(rek(n)%t!=0)
        {
            n++;
        }
        return n;
    }
}