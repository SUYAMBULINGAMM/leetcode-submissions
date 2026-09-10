class Solution {
    public long distributeCandies(int n, int limit) {
        return mercount(n)-3 * mercount(n-(limit+1))+3*mercount(n-2*(limit+1))-mercount(n-3*(limit+1));
    }
    private long mercount(long sum)
    {
        if(sum<0)return 0;
        return (sum+2)*(sum+1)/2;
    }
}