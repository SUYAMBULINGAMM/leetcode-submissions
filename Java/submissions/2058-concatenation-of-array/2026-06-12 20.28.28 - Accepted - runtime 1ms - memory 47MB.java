class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=2*nums.length;
        int ans[]=new int[n];
        int j=2,k=0;
        while(j>0)
        {
            for(int i=0;i<nums.length;i++)
            {
                ans[k]=nums[i];
                k++;
            }
            j--;
        }
        return ans;
    }
}