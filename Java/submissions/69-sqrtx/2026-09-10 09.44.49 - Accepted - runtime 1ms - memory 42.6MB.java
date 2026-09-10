class Solution {
    public int mySqrt(int x) {
        if(x<2)
        {
            return x;
        }
        int r=x/2;
        while(r>x/r)
        {
            r=(r+x/r)/2;
        }
        return r;
    }
}