class Solution {
    public boolean hasAllCodes(String s, int k) {
        int n=s.length();
        int r=1<<k;
        Set<String> seen=new HashSet<>();
        for(int end=k;end<=n;end++)
        {
            String sub=s.substring(end-k,end);
            if(seen.add(sub))
            {
                r--;
            }
            if(r == 0)
            {
                return true;
            }
        }
        return false;
    }
}