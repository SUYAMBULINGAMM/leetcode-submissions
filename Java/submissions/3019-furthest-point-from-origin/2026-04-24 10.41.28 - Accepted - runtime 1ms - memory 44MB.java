class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int n=moves.length();
        int l=0;
        int r=0;
        int p=0;
        for(char c : moves.toCharArray())
        {
            if(c == 'L')
            {
                l++;
            }
            else if(c== 'R')
            {
                r++;
            }
            else
            {
                p++;
            }
        }
        return Math.abs(l-r) + p;
    }
}