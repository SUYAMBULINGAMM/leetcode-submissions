class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String ans="";
        for(String w:words)
        {
            int sum=0;
            for(char ch:w.toCharArray())
            {
                sum+=weights[ch-'a'];
            }
            int m=sum%26;
            char rev=(char)('z'-m);
            ans+=rev;
        }
        return ans;
    }
}