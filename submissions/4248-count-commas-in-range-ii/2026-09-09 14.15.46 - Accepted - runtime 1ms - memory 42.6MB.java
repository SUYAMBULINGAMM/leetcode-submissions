class Solution {
    public long countCommas(long n) {
        if(n<1000)
        {
            return 0;
        }
        long com=0;
        long comma=1;
        long start=1000;
        while(start<=n)
        {
            long end=start*1000-1;
            if(end>n)
            {
                end=n;
            }
            com+=(end-start+1)*comma;
            start*=1000;
            comma++;
        }
        return com;
    }
}