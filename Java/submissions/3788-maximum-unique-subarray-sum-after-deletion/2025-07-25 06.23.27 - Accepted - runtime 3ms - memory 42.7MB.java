class Solution {
    public int maxSum(int[] nums) {
        // return Arrays.stream(nums).distinct().sum();
        int sum=0;
        Set<Integer> a = new HashSet<>();
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                a.add(nums[i]);
            }
            else
            {
                max=Math.max(max,nums[i]);
            }

        }
        for(int v:a)
        {
            sum+=v;
        }
        if(a.size()>0)
        {
            return sum;
        }
        else
        {
            return max;
        }
        
    }
}