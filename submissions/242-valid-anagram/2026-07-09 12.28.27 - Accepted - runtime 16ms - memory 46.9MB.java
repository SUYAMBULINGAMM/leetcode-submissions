class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> h1=new HashMap<>();
        HashMap<Character,Integer> h2=new HashMap<>();
        if(s.length() != t.length())
        {
            return false;
        }
        for(char ch: s.toCharArray())
        {
            h1.put(ch,h1.getOrDefault(ch,0)+1);
        }
        for(char ch:t.toCharArray())
        {
            h2.put(ch,h2.getOrDefault(ch,0)+1);
        }
        for(char ch:s.toCharArray())
        {
            if(h1.containsKey(ch) && h2.containsKey(ch))
            {
                if(!h1.get(ch).equals(h2.get(ch)))
                {
                    return false;
                }
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}