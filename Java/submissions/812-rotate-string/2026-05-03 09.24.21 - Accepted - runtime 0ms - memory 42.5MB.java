class Solution {
    public boolean rotateString(String s, String goal) {
        int s1=s.length();
        int s2=goal.length();
        if(s1 != s2)
        {
            return false;
        }
        return (s+s).contains(goal);
    }
}