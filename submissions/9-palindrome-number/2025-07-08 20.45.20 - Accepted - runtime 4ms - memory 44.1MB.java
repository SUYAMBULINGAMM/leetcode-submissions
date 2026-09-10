class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        {
            return false;
        }
        int r=0;
        int num=x;
        while(num!=0)
        {
            r=r*10+num%10;
            num=num/10;
        }
        return (r==x);
    }
}