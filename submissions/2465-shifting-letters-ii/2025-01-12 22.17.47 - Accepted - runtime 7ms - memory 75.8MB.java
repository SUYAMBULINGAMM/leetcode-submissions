class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int n=s.length();
        int []a=new int[n+1];
        for(int []b : shifts)
        {
            int st=b[0],e=b[1],d=b[2];
            a[st]+=(d==1 ? 1 : -1);
            if(e+1<n)
            { 
               a[e+1]-=(d==1?1:-1);
            }
        }
            int c=0;
            for(int i=0;i<n;i++)
            {
                c+=a[i];
                a[i]=c;
            }
            StringBuilder r=new StringBuilder(s);
            for(int i=0;i<n;i++)
            {
                int net=(a[i]%26+26)%26;
                r.setCharAt(i,(char)('a'+(s.charAt(i)-'a'+net)%26));
            }
            return r.toString();
    }
}