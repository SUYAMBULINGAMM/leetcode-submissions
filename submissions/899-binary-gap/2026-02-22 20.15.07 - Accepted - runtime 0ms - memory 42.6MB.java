class Solution {
    public int binaryGap(int n) {
        int ls=-1;
        int max=0;
        int i=0;
        while(n>0)
        {
            if((n & 1) == 1)
            {
                if(ls!=-1)
                {
                    max=Math.max(max,i-ls);
                }
                ls=i;
            }
            n>>=1;
            i++;
        }
        return max;
    }
}