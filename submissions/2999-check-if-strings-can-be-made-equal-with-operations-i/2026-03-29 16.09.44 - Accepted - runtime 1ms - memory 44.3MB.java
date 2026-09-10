class Solution {
    public boolean canBeEqual(String s1, String s2) {
        char []ch=s1.toCharArray();
        char []ch1=s2.toCharArray();
        for(int i=0;i<s1.length()/2;i++)
        {
            int j=i+2;
            if((ch[i] == ch1[i]) && (ch[j] == ch1[j]))
            {
                continue;
            }
            else
            {
                char t=ch[i];
                ch[i]=ch[j];
                ch[j]=t;
            }
        }
        String res = new String(ch);
        if(res.equals(s2))
        {
            return true;
        }
        return false;
    }
}