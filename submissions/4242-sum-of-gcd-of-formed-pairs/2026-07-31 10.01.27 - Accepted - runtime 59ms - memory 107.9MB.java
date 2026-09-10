class Solution {
    public static int gcd(int a,int b)
    {
        if(b == 0) return a;
        return gcd(b,(a%b));
    }
    public long gcdSum(int[] nums) {
        int n=nums.length;
        int pgcd[]=new int[n];
        int max=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]>max)
            {
                max=nums[i];
            }
            pgcd[i]=gcd(nums[i],max);
        }
        Arrays.sort(pgcd);
        int j=0;
        int k=pgcd.length-1;
        long sum=0;
        while(j<k)
        {
            long f=gcd(pgcd[j],pgcd[k]);
            sum+=f;
            j++;
            k--;
        }
        return sum;
    }
}