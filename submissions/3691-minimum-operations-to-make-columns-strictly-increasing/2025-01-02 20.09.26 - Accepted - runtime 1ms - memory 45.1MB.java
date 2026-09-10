class Solution {
    public int minimumOperations(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int t=0;
        for(int i=0;i<n;i++)
            {
                for(int j=1;j<m;j++)
                    {
                        if(grid[j][i]<=grid[j-1][i])
                        {
                            int inc=grid[j-1][i]-grid[j][i]+1;
                            grid[j][i]+=inc;
                            t+=inc;
                        }
                    }
            }
        return t;
    }
}