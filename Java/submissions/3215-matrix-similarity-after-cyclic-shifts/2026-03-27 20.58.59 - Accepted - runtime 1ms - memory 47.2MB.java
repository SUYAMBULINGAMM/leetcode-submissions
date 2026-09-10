class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int m=mat.length;
        int n=mat[0].length;
        k%=n;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                int c=0;
                if(i%2 == 0)
                {
                    c=(j+k)%n;
                }
                else
                {
                    c=(j-k+n)%n;
                }
                if(mat[i][j]!=mat[i][c])
                {
                    return false;
                }
            }
        }
        return true;
    }
}