class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0)
        {
            return true;
        }
        char cs[]=s.toCharArray();
        char ct[]=t.toCharArray();
        int j=0;
        for(int i=0;i<t.length() && j<s.length() ; i++)
        {
            if(cs[j]==ct[i])
            {
                j++;
            }

        }
        return j==s.length();
    }

}