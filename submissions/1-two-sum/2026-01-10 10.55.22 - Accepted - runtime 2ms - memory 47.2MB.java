class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> h=new HashMap<>();
       for(int i=0;i<nums.length;i++)
       {
        int com=target-nums[i];
        if(!h.containsKey(com))
        {
            h.put(nums[i],i);
        }
        else
        {
            return new int[]{
                h.get(com),i
            };
        }
       }
    
    return new int[]{};
    }
}