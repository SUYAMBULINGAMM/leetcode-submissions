class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> arr=new ArrayList<>();
        int n=nums.length;
        int max=nums[0],min=nums[0];
        for(int i=0;i<n;i++)
        {
            if(nums[i]>max)
            {
                max=nums[i];
            }
            else if(nums[i]<min)
            {
                min=nums[i];
            }
        }
        System.out.print(min+" "+max);
        for(int i=min+1;i<max;i++)
        {
            boolean f=false;
            for(int j=0;j<n;j++)
            {
                if(nums[j]==i)
                {
                    f=false;
                    break;
                }
                else
                {
                    f=true;
                }
            }
            if(f)
            {
                arr.add(i);
            }
        }
        return arr;
    }
}