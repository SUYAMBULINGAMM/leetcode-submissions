class Solution {
    public int minPartitions(String n) {
      int m=0;
      for(char ch: n.toCharArray())
      {
        m=Math.max(m,ch-'0');
        if(m == 9)
        {
            return m;
        }
      }
      return m;
    }
}