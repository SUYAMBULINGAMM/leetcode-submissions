class Solution {
    public int[] sortByBits(int[] arr) {
        int n = arr.length;
        List<int[]> l=new ArrayList<>();
        for(int a : arr)
        {
            int count = Integer.bitCount(a);
            l.add(new int[] {a,count});
        }
        Collections.sort(l, (a,b) -> a[1] != b[1] ? a[1] - b[1] : a[0] - b[0]);
        int r[]=new int[n];
        for(int i=0;i<l.size();i++)
        {
            r[i]=l.get(i)[0];
        }
        return r;
    }
}