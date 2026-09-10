class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        long ts=0;
        long rs=0;
        long cs=0;
        int m=grid.length;
        int n=grid[0].length;
        System.out.print(m);
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                ts+=grid[i][j];
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                rs+=grid[i][j];
            }
            if(rs == (ts - rs))
            {
                return true;
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                cs+=grid[j][i];
            }
            if(cs == (ts - cs))
            {
                return true;
            }
        }
        return false;

    }
}