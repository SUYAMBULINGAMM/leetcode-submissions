class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<Integer> a=new ArrayList<>();
        a.add(0);
        for(int i=1;i<groups.length;i++)
        {
            if(groups[i]!=groups[i-1])
            {
                a.add(i);
            }
        }
        List<String> b=new ArrayList<>();
        for(int e:a)
        {
            b.add(words[e]);
        }
        return b;
    }
}