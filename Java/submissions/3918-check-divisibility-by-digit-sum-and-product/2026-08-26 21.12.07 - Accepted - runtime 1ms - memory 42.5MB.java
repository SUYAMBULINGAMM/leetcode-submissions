class Solution {
    public int digitsum(int n)
    {
        int sum=0;
        while(n>0)
        {
            int digit=n%10;
            sum+=digit;
            n/=10;
        }
        return sum;
    }
    public int digitproduct(int n)
    {
        int sum=1;
        while(n>0)
        {
            int digit=n%10;
            sum*=digit;
            n/=10;
        }
        return sum;
    }
    public boolean checkDivisibility(int n) {
        if(n<10)
        {
            return false;
        }
        int ds=digitsum(n);
        int dp=digitproduct(n);
        int total=ds+dp;
        if(n%total == 0)
        {
            return true;
        }
        return false;
        
    }
}