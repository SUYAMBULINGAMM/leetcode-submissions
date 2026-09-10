class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , List<String>> h=new HashMap<>();
        for(String w:strs)
        {
            char[] ch=w.toCharArray();
            Arrays.sort(ch);
            String key=new String(ch);
            h.putIfAbsent(key,new ArrayList<>());
            h.get(key).add(w);

        }
        return new ArrayList<>(h.values());
    }
}