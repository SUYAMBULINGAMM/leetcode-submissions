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
                if(isfreq(a))
                {
                    m=Math.max(m,j-i+1);
                }
            }
        }
        return m;
    }
    public static boolean isfreq(int arr[])
    {
        int v=0;
        for(int c:arr)
        {
            if(c == 0) continue;
            if(v == 0) v=c;
            else if(v!=c) return false;
        }
        return true;
    }
}