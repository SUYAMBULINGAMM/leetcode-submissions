class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0,b=0;
        HashMap<Character,Integer> h=new HashMap<>();
        for(int r=0;r<s.length();r++)
        {
            char c=s.charAt(r);
            if(h.containsKey(c) && h.get(c)>=l)
            {
                l=h.get(c)+1;
            }
            h.put(c,r);
            b=Math.max(b,r-l+1);
        }
        return b;
    }
}