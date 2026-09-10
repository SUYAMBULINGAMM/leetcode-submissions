class Solution {
    public int check(int []arr,int i,int n)
    {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int j=0;j<=i;j++)
        {
            if(max<arr[j])
            {
                max=arr[j];
            }
        }
        for(int j=i;j<n;j++)
        {
            if(min>arr[j])
            {
                min=arr[j];
            }
        }
        System.out.print(max+" "+min);
        int result=max-min;
        return result;
    }
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            int instability=check(nums,i,n);
            if(instability<=k)
            {
                return i;
            }
        }
        return -1;
    }
}