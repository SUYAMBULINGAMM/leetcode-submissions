class Solution {
    public int countPalindromicSubsequence(String s) {
        HashSet<Character>a=new HashSet<>();
        int []b=new int[s.length()];
        for(int i=0;i<s.length();i++)
        {
            a.add(s.charAt(i));
            b[i]=a.size();
        }
        int c=0;
        for(char d : a)
        {
            int i=-1,j=-1;
            for(int k=0;k<s.length();k++)
            {
                if(s.charAt(k)==d)
                {
                    if(i==-1)
                    {
                        i=k;
                    }
                    else
                    {
                        j=k;
                    }

                }
            }
            if(j-i>1)
            {
                HashSet<Character>e=new HashSet<>();
                i++;
                while(i<j)
                {
                    e.add(s.charAt(i));
                    i++;
                }
                c+=e.size();
            }
        }
        return c;
    }
}