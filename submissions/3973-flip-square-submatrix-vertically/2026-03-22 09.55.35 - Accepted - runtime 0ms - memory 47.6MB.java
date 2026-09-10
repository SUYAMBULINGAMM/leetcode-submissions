class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int l = x;
        int r= x+k-1;
        while(l < r)
        {
            for(int i=y ; i<y+k ; i++)
            {
                int t = grid[l][i];
                grid[l][i] = grid[r][i];
                grid[r][i]=t;
            }
            l++;
            r--;
        }
        return grid;
    }
}

// x+k-1