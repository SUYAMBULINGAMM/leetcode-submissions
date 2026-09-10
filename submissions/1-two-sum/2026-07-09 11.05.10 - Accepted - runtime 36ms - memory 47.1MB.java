class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>h=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int sum=nums[i]+nums[j];
                if(sum == target)
                {
                    h.put(i,j);
                    break;
                }
            }
        }
        for(Map.Entry<Integer,Integer> entry : h.entrySet())
        {
            return new int[]{entry.getKey(),entry.getValue()};
        }
        return new int[]{};


    }
}