class Solution {
    public int countCommas(int n) {
        if(n<1000)
        {
            return 0;
        }
        int c=0;
        for(int i=1000;i<=n;i++)
        {
            c++;
        }
        return c;
    }
}