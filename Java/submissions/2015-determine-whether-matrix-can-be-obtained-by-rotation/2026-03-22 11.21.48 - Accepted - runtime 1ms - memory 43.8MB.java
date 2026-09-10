class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int l=mat.length;
        for(int k=0 ; k<4 ;k++)
        {
            boolean flag = true;
            int res[][] = new int[l][l];
            for(int i=0;i<l;i++)
            {
                for(int j=0;j<l;j++)
                {
                    res[i][j] = mat[j][l-1-i]; 
                }
            }
            mat = res;
            for(int i=0;i<l;i++)
            {
                for(int j=0;j<l;j++)
                {
                    if(mat[i][j] != target[i][j])
                    {
                        flag = false;
                        break;
                    }
                }
            }
            if(flag) return true;
           
        }
        return false;
    }
}