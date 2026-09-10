class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(h.isEmpty())
            {
                h.add(nums[i]);
            }
            else if(h.contains(nums[i]))
            {
                return true;
            }
            else
            {
                h.add(nums[i]);
            }
        }
        return false;
        
    }
}