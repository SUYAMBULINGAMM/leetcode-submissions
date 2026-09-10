class Solution {
    public int maximumLengthSubstring(String s) {
        int i=0,j=0,k=2;
        int max=0;
        int n=s.length();
        int []h=new int[26];
        while(j<n)
        {
            int idx=s.charAt(j)-'a';
            while(h[idx]==k)
            {
                h[s.charAt(i)-'a']--;
                i++;
            }
            h[idx]++;
            max=Math.max(max,j-i+1);
            j++;
        }
        return max;
    }
}