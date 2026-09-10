class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> h=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> map:h.entrySet())
        {
            if(map.getValue() == 1)
            {
                return map.getKey();
            }
        }
        return -1;
    }
}