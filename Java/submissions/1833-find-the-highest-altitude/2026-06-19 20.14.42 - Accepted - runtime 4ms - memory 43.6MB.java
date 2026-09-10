class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int res[]=new int[n+1];
        res[0]=0;
        for(int i=0;i<n;i++)
        {
            int sum=res[i]+gain[i];
            res[i+1]=sum;
        }
        Arrays.sort(res);
        return res[res.length-1];
    }
}