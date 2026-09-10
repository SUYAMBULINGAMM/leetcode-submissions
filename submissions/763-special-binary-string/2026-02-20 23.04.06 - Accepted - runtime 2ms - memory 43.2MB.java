class Solution {
    public String makeLargestSpecial(String s) {
        List<String> str=new ArrayList<>();
        int c=0;
        int st=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == '1') c++;
            else c--;
            if(c == 0)
            {
                String inner=makeLargestSpecial(s.substring(st+1,i));
                str.add("1" + inner + "0");
                st=i+1;
            }
        }
        Collections.sort(str, Collections.reverseOrder());
        StringBuilder sb=new StringBuilder();
        for(String res: str)
        {
            sb.append(res);
        }
        return sb.toString();
    }
}