class Solution {
    public int numdigit(int v,int i)
    {
        int sum=0;
        while(v>0)
        {
            int digit=v%10;
            sum+=digit;
            v/=10;
        }
        if(sum == i)
        {
            return sum;
        }
        return -1;
    }
    public int smallestIndex(int[] nums) {
        int n=nums.length;
        int small=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
           int digit = numdigit(nums[i],i);
           if(digit<small)
           {
                if(digit!=-1)
                {
                    small=digit;
                }
           }
        }
        return (small == Integer.MAX_VALUE) ? -1 : small;

    }
}