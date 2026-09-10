import java.math.BigInteger;
class Solution {
    public int numSteps(String s) {
        BigInteger n=new BigInteger(s,2);
        int count=0;
        while(!n.equals(BigInteger.ONE))
        {
            
            if(n.mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO))
            {
                n=n.divide(BigInteger.valueOf(2));
            }
            else
            {
                n=n.add(BigInteger.ONE);
            }
            count++;
        }
        return count;
    }
}