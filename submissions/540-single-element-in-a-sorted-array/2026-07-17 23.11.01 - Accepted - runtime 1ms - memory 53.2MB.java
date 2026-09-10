class Solution {
    public int singleNonDuplicate(int[] nums) {
        int k=0;
        for(int i:nums)
        {
            k=k^i;
        }
        return k;
    }
}