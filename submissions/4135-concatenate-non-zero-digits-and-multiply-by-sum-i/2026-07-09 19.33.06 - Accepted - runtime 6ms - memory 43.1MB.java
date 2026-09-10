class Solution {
    public long sumAndMultiply(int n) {
        String s=String.valueOf(n);
        char a[]=s.toCharArray();
        String res="";
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i] == '0')
            {
                continue;
            }
            else
            {
                res+=a[i];
                sum+=Character.getNumericValue(a[i]);
            }
        }
        if(res.isEmpty())
        {
            return 0;
        }
        int f=Integer.parseInt(res);
        return (long)f*sum;

        
    }
}