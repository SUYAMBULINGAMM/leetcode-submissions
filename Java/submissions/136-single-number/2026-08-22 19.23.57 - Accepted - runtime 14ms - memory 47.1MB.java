class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:h.entrySet())
        {
            if(entry.getValue() == 1)
            {
                return entry.getKey();
            }
        }
        return 0;
    }
}