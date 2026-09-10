class Solution {
    private boolean isVowel(char C)
    {
        return C=='a'||C=='e'||C=='i'||C=='o'||C=='u';
    }
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n=words.length;
        int []prefix=new int[n+1];
        for(int i=0;i<n;i++)
        {
            String word=words[i];
            if(isVowel(word.charAt(0))&&isVowel(word.charAt(word.length()-1)))
            {
                prefix[i+1]=prefix[i]+1;
            }
            else
            {
                prefix[i+1]=prefix[i];
            }
        }
        int []r=new int[queries.length];
        for(int i=0;i<queries.length;i++)
        {
            int l=queries[i][0];
            int r1=queries[i][1];
            r[i]=prefix[r1+1]-prefix[l];
        }
        return r;

    }
}