class Solution {
    public boolean isvalid(int i,int j,int m,int n,int mat[][])
    {
        for(int t=0;t<n;t++)
        {
            if(t != j && mat[i][t] == 1)
            {
                return false;
            }
        }
        for(int t=0;t<m;t++)
        {
            if(t != i && mat[t][j] == 1)
            {
                return false;
            }
        }
        return true;
    }
    public int numSpecial(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int c=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(mat[i][j] == 1)
                {
                    if(isvalid(i,j,m,n,mat))
                    {
                        c++;
                    }
                }
            }
        }
        return c;
    }
}