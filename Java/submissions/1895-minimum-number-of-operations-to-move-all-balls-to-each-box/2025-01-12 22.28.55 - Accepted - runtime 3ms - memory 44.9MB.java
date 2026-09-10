class Solution {
    public int[] minOperations(String boxes) {
        int n=boxes.length();
        int []d=new int[n];
        int pc=0;
        int ps=0;
        for(int i=0;i<n;++i)
        {
            d[i]=pc*i-ps;
            if(boxes.charAt(i)=='1')
            {
                ++pc;
                ps+=i;
            }
        }
        int sc=0;
        int ss=0;
        for(int i=n-1;i>=0;--i)
        {
            d[i]+=ss-sc*i;
            if(boxes.charAt(i)=='1')
            {
                ++sc;
                ss+=i;
            }

        }        
        return d;
    }
}