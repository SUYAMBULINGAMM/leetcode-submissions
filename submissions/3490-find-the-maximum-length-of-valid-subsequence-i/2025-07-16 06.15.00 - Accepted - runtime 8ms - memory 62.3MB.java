class Solution {
    public int maximumLength(int[] nums) {
        int ec=0;
        int oc=0;
        for(int n:nums)
        {
            if(n%2==0)
            {
                ec++;
            }
            else
            {
                oc++;
            }
        }
        int edp=0;
        int odp=0;
        for(int n:nums)
        {
            if(n%2==0)
            {
                edp=Math.max(edp,odp+1);
            }
            else
            {
                odp=Math.max(odp,edp+1);
            }
        }
        return Math.max(Math.max(ec,oc),Math.max(edp,odp));
        
    }
}