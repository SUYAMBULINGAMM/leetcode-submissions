class Solution {
    public int bitwiseComplement(int n) {
        String b=Integer.toBinaryString(n);
        char []ch=b.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i] == '1')
            {
                ch[i]='0';
            }
            else
            {
                ch[i]='1';
            }
        }
        int d=Integer.parseInt(new String(ch),2);
        return d;
        
    }
}