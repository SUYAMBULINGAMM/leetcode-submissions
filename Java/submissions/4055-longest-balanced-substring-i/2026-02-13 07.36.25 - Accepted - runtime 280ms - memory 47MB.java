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
        int min=Integer.MAX_VALUE,max=0;
        for(int c:arr)
        {
            if(c>0)
            {
                min=Math.min(min,c);
                max=Math.max(max,c);
            }
        }
        if(min == max)
        {
            return true;
        }
        return false;
    }
}