class Solution {
    public boolean isPalindrome(int x) {
        String a=Integer.toString(x);
        StringBuilder sb=new StringBuilder(a);
        sb.reverse();
        System.out.print(sb);
        if(a.equals(sb.toString()))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}