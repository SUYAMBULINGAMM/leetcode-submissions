class Solution {
    public int minimumMoves(String s) {
        int c=0,i=0;
        char ch[]=s.toCharArray();
        while(i<ch.length)
        {
            if(ch[i]=='X')
            {
                i=i+3;
                c++;
            }
            else
            {
                i++;
            }
        }
        return c;
    }
}