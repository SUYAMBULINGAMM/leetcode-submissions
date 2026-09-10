class Solution {
    public int minSwaps(int[][] grid) {
        int n=grid.length;
        int tz[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int c=0;
            for(int j=n-1;j>=0;j--)
            {
                if(grid[i][j] == 0)
                {
                    c++;
                }
                else
                {
                    break;
                }
            }
            tz[i]=c;
        }
        int s=0;
        for(int i=0;i<n;i++)
        {
            int required=n -i -1;
            int j=i;
            while(j<n && tz[j]<required)
            {
                j++;
            }
            if(j == n)
            {
                return -1;
            }
            while(j>i)
            {
                int t=tz[j];
                tz[j]=tz[j-1];
                tz[j-1]=tz[j];
                s++;
                j--;

            }
        }
        return s;
    }
}