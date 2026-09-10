class Solution {
    public boolean checkStrings(String s1, String s2) {
        int even[]=new int[26];
        int odd[]=new int[26];
        int even1[]=new int[26];
        int odd1[]=new int[26];
        for(int i=0;i<s1.length();i++)
        {
            if(i%2 == 0)
            {
                even[s1.charAt(i) - 'a']++;
                even1[s2.charAt(i) - 'a']++;
            }
            else
            {
                odd[s1.charAt(i) - 'a']++;
                odd1[s2.charAt(i) - 'a']++;
            }
        }
        for(int i=0;i<26;i++)
        {
            if((even[i] != even1[i]) || (odd[i] != odd1[i]))
            {
                return false;
            }
            
        }
        return true;
        
    }
}