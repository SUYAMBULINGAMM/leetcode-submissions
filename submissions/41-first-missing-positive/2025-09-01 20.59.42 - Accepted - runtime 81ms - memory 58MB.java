class Solution {
    public int firstMissingPositive(int[] nums) {
        TreeSet<Integer> t=new TreeSet<>();
        for(int i:nums)
        {
            if(i>0) 
            {
                t.add(i);
            }
        }
        if(t.size()==0) 
        {
            return 1;
        }
        int max=t.last();
        for(int i=1;i<max;i++)
        {
            if(!t.contains(i)) return i; 
        }
        return max+1;
    }
}