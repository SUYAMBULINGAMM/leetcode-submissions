class Solution {
    public int longestBalanced(String s) {
        int n=s.length();
        int m=0;
        for(int i=0;i<n;i++)
        {
            int a[]=new int[26];
            for(int j=i;j<n;j++)
            {
                a[s.charAt(j) - 'a']++;
                int min=Integer.MAX_VALUE,max=0;
                for(int c:a)
                {
                    if(c>0)
                    {
                        min=Math.min(min,c);
                        max=Math.max(max,c);
                    }
                }
                if(min == max)
                {
                    m=Math.max(m,j-i+1);
                }
            }
        }
        return m;
    }
}