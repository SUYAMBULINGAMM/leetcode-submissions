class Solution {
    public String processStr(String s) {
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray())
        {
            if(Character.isLowerCase(ch))
            {
                sb.append(ch);
            }
            else if(ch == '#')
            {
                sb.append(sb.toString());
            }
            else if(ch == '%')
            {
                sb.reverse();
            }
            else if(ch == '*')
            {
                if(sb.length()>0)
                {
                    sb.deleteCharAt(sb.length()-1);
                }
            }

        }
        return sb.toString();
    }
}