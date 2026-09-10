class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<String> r=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            r.add(String.valueOf(i));
        }
        Collections.sort(r);
        List<Integer> o=new ArrayList<>();
        for(String num:r)
        {
            o.add(Integer.parseInt(num));
        }
        return o;


    }
}