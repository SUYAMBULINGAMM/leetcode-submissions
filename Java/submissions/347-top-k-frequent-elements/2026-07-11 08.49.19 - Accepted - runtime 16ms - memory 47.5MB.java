class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer , Integer> h=new HashMap<>();
        for(int i:nums)
        {
            h.put(i,h.getOrDefault(i,0)+1);
        }
        List<Integer> K=new ArrayList<>(h.keySet());
        K.sort((a,b)->h.get(b)-h.get(a));
        int []ans=new int[k];
        for(int i=0;i<k;i++)
        {
            ans[i]=K.get(i);
        }
        return ans;
    }
}