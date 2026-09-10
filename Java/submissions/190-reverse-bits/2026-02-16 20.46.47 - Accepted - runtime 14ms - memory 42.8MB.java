class Solution {
    public int reverseBits(int n) {
        String a=String.format("%32s",Integer.toBinaryString(n)).replace(' ','0');
        StringBuilder sb=new StringBuilder(a);
        sb.reverse();
        int r=Integer.parseInt(sb.toString(),2);
        return r;
    }
}