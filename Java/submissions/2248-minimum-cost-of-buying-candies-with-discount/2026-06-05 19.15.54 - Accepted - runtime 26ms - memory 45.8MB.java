class Solution {
    public int minimumCost(int[] cost) {
        int sum=0,j=0;
        Arrays.sort(cost);
        int rev[]=new int[cost.length];
        for(int i=cost.length-1;i>=0;i--)
        {
            rev[j]=cost[i];
            j++;
        }
        System.out.print(Arrays.toString(rev));
        for(int i=0;i<j;i++)
        {
            if(i%3!=2)
            {
                sum+=rev[i];
                System.out.println(sum);
            }
        }
        return sum;
    }
}