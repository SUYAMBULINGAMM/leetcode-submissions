class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length()-needle.length() == 0)
        {
            if(haystack.equals(needle))
            {
                return 0;
            }
        }
        else
        {
            for(int i=0;i<=haystack.length() - needle.length() ;i++)
            {
                if(needle.length()==0) return 0;
                String s=haystack.substring(i,i+needle.length());
                if(s.equals(needle))
                {
                    return i;
                }
            }
        }
        return -1;
        
    }
}