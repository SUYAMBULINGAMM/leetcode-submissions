class Solution {
    public int maxScore(String s) {
        int maxscore=0;
        int leftscore=0;
        int rightscore=0;
        for(char c : s.toCharArray())
        {
            if(c=='1')
            {
                rightscore++;
            }
        }
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)=='0')
            {
                leftscore++;
            }
            else
            {
                rightscore--;
            }
            maxscore=Math.max(maxscore,leftscore+rightscore);
        }
        return maxscore;
    }
}