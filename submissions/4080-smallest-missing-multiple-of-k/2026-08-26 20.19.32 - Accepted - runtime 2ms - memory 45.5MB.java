class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> h=new HashSet<>();
        for(int n:nums)
        {
            h.add(n);
        }
        for(int i=k;i<=k*nums.length;i+=k)
        {
            
            if(!h.contains(i))
            {
                return i;
            }
        }
        return k*(nums.length+1);
    }
}