class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> r=new ArrayList<>();
        for(int i=0;i<12;i++)
        {
            for(int j=0;j<60;j++)
            {
                int tb=Integer.bitCount(i) + Integer.bitCount(j);
                if(tb == turnedOn)
                {
                    r.add(i+":"+String.format("%02d",j));
                }
            }
        }
        return r;
    }
}