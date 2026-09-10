class Solution {
    public int longestSubstring(String s, int k) {
        return helper(s,k);
    }
    public static int helper(String s,int k)
    {
        HashMap<Character,Integer> h=new HashMap<>();
        int n=s.length();
        if(n<k)
        {
            return 0;
        }
        for(int i=0;i<n;i++)
        {
            h.put(s.charAt(i),h.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<n;i++)
        {
            int count=h.get(s.charAt(i));
            if(count<k)
            {
                int l=helper(s.substring(0,i),k);
                int r=helper(s.substring(i+1),k);
                return Math.max(l,r);
            }

        }
        return s.length();
    }
}