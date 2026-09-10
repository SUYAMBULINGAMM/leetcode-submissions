class Solution {
    public String rotate(String s,int a)
    {
        int k=1;
        String res=s.substring(a-k)+s.substring(0,a-k);
        return res;
    }
    public boolean rotateString(String s, String goal) {
        int s1=s.length();
        int s2=goal.length();
        if(s1 != s2)
        {
            return false;
        }
        if(s1 == s2)
        {
            for(int i=0;i<s1;i++)
            {
                while(s.equals(goal))
                {
                    return true;
                }
                String rot=rotate(s,s1);
                s=rot;
            }
        }
        return false;
    }
}