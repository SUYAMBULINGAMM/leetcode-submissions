class Solution {
    public int maxArea(int[] height) {
        int m=0;
        int l=0;
        int r=height.length-1;
        while(l<r)
        {
            m=Math.max(m,(r-l)*Math.min(height[l],height[r]));
            if(height[l]<height[r])
            {
                l++;
            }
            else
            {
                r--;
            }
        }
        return m;
        
    }
}