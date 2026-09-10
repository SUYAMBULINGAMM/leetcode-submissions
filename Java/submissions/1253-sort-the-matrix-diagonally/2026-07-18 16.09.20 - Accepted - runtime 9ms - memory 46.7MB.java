class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int i=mat.length;
        int j=0;
        while(j<mat[0].length)
        {
            ArrayList<Integer> h=new ArrayList<>();
            int m=i,n=j;
            while(m<mat.length && n<mat[0].length)
            {
                h.add(mat[m][n]);
                m++;
                n++;
            }
            Collections.sort(h);
            m=i;
            n=j;
            for(int k:h)
            {
                mat[m][n]=k;
                m++;
                n++;
            }
            if(i!=0)
            {
                i--;
            }
            else
            {
                j++;
            }

        }
        return mat;

    }
}