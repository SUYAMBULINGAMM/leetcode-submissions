class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        List<List<Integer>> res=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++)
        {
            min=Math.min(min,Math.abs(arr[i+1]-arr[i]));
        }
        for(int i=0;i<n-1;i++)
        {
            if(Math.abs(arr[i+1]-arr[i]) == min)
            {
                res.add(Arrays.asList(arr[i],arr[i+1]));

            }
        }
        return res;
    }
}