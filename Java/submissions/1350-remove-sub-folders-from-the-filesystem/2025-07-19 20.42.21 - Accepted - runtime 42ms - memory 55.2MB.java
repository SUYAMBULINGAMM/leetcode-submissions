class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        ArrayList<String> a=new ArrayList<>();
        a.add(folder[0]);
        int n=folder.length;
        for(int i=1;i<n;i++)
        {
            if(!folder[i].startsWith(a.get(a.size()-1)+"/"))
            {
                a.add(folder[i]);
            }
        }
        return a;
    }
}