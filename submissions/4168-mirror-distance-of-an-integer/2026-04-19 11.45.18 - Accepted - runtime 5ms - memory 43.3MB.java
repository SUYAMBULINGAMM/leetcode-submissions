class Solution {
    public int reverse(int x)
    {
        String a="";
        while(x!=0)
        {
            int d=x%10;
            a+=d+"";
            x=x/10;
        }
        return Integer.parseInt(a);
    }
    public int mirrorDistance(int n) {
        int result=Math.abs(n-reverse(n));
        
        return result;
    }
}