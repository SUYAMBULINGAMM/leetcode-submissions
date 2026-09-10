class Solution {
    public static int gcd(int a,int b)
    {
        if(b == 0) return a;
        return gcd(b,(a%b));
    }
    public int gcdOfOddEvenSums(int n) {
        int odd=n*n;
        int even=n*(n+1);
        int res=gcd(odd,even);
        return res;
    }
}