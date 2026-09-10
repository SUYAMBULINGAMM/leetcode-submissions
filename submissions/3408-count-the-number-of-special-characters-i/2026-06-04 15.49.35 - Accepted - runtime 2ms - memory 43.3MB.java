class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> h=new HashSet<>();
        int c=0;
        for(char ch:word.toCharArray())
        {
            h.add(ch);
        }
        for(char n='a';n<='z';n++)
        {
            if(h.contains(n) && h.contains(Character.toUpperCase(n)))
            {
                c++;
            }
        }
        return c;
    }
}