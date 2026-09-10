class Solution {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if((nums[i]+nums[j]==target))
                {
                    a.add(i);
                    a.add(j);
                }
            }
        }
        int []b=a.stream().mapToInt(Integer::intValue).toArray();
        return b;
    }
}