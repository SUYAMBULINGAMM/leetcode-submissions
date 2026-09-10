class Solution {
    public static int fact(int f)
    {
        if(f == 0 || f == 1) return 1;
        return f*fact(f-1);
    }
    public boolean isDigitorialPermutation(int n) {
        int temp=n;
        int sum=0;
        while(n!=0)
            {
                int d=n%10;
                sum+=fact(d);
                n=n/10;
            }
        char []a=String.valueOf(temp).toCharArray();
        char []b=String.valueOf(sum).toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a,b);
    }
}