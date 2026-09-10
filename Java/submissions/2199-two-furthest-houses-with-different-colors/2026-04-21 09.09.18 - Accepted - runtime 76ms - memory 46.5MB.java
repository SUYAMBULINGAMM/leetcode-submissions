class Solution {
    public int maxDistance(int[] colors) {
        int max=0;
        for(int i=0;i<colors.length;i++)
        {
        for(int j=i+1;j<colors.length;j++)
        {
            if(colors[i]!=colors[j])
            {
                int d=Math.abs(i-j);
                System.out.println(d+""+i+""+j);
                if(max<d)
                {
                    max=d;
                }
            }
        }
        }
        System.out.print(max);
        return max;
    }
}