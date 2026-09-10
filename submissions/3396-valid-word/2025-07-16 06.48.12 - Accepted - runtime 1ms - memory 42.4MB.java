class Solution {
    public boolean isValid(String word) {
        if(word.length()<3)
        {
            return false;
        }
        int v=0;
        int con=0;
        for(char c:word.toCharArray())
        {
            if(Character.isLetter(c))
            {
                if("aeiouAEIOU".indexOf(c)!=-1)
                {
                    v++;
                }
                else
                {
                    con++;
                }
            }
            else if(!Character.isDigit(c))
            {
                return false;
            }
        }
        return v>=1 && con>=1;
        
    }
}