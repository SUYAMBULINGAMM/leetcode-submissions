class Solution {
    public boolean uniformArray(int[] nums1) {
        int minodd=Integer.MAX_VALUE;
        for(int i:nums1)
        {
            if(i%2!=0)
            {
                minodd=Math.min(minodd,i);
            }
        }
        if(minodd == Integer.MAX_VALUE) return true;
        for(int num:nums1)
        {
            if(num%2 == 0 && num<=minodd)
            {
                return false;
            }
        }
        return true;
    }
}