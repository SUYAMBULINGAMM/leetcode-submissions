class Solution {
    public int lengthOfLIS(int[] nums) {
        ArrayList<Integer> tail=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(tail.isEmpty())
            {
                tail.add(nums[i]);
            }
            else if(nums[i]>tail.get(tail.size()-1))
            {
                tail.add(nums[i]);
            }
            else
            {
                for(int j=0;j<tail.size();j++)
                {
                    int cur=nums[i];
                    if(tail.get(j)>=cur)
                    {
                        tail.set(j,cur);
                        break;
                    }
                    
                }
            }
        }
        System.out.print(tail);
        return tail.size();
    }

}