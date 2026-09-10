class Solution {
    public char findKthBit(int n, int k) {
        String []p=new String[n];
        for(int i=0;i<n;i++)
        {
            if(i == 0)
            {
                p[i]="0";
            }
            else
            {
                p[i]=p[i-1]+"1"+reverse(invert(p[i-1]));
            }
        }
        String pos=p[n-1];
        char res=pos.charAt(k-1);
        return res;
    }
    public String invert(String s)
    {
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i] == '0')
            {
                ch[i]='1';
            }
            else
            {
                ch[i]='0';
            }
        }
        String invert=new String(ch);
        return invert;
    }
    public String reverse(String r)
    {
        StringBuilder sb=new StringBuilder(r);
        sb.reverse();
        return sb.toString();
    }
}