class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int n:arr)
        {
            m.put(n,m.getOrDefault(n,0)+1);
        }
        int l=-1;
        for(int k:m.keySet())
        {
            if(m.get(k)==k)
            {
                l=k;
            }
        }
        return l;
        
    }
}