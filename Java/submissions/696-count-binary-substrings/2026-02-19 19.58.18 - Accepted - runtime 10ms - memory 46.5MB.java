class Solution {
    public int countBinarySubstrings(String s) {
        int cg=1;
        int pg=0;
        int ans=0;
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i-1) == s.charAt(i))
            {
                cg++;
            }
            else
            {
                ans+=Math.min(pg,cg);
                pg=cg;
                cg=1;
            }
        }
        ans+=Math.min(pg,cg);
        return ans;
    }
}