class Solution {
    public static int gcd(int a,int b)
    {
        if(b == 0) return a;
        return gcd(b,(a%b));
    }
    public int findGCD(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>max)
            {
                max=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<min)
            {
                min=nums[i];
            }
        }
        System.out.print(min+" "+max);
        int result=gcd(min,max);
        return result;
    }
}