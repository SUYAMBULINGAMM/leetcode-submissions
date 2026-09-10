class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> arr=new ArrayList<>();
        Arrays.sort(nums);
        boolean []s=new boolean[n+1];
        for(int x:nums)
        {
            s[x]=true;
        }
        for(int i=1;i<=n;i++)
        {
            if(!s[i])
            {
                arr.add(i);
            }
        }
        return arr;
    }
}