class Solution {
    public String largestNumber(int[] nums) {
        String []arr=new String[nums.length];
        int k=0;
        for(int i:nums)
        {
            arr[k++]=String.valueOf(i);
        }
        Arrays.sort(arr,(a,b)->
        {
            int i=0,j=0;
            int la=a.length(),lb=b.length();
            while(i<la+lb && j<la+lb)
            {
                char c1=i<la ? a.charAt(i) : b.charAt(i-la);
                char c2=j<lb ? b.charAt(j) : a.charAt(j-lb);
                if(c1 != c2) return c2-c1;
                i++;
                j++;
            }
            return 0;
        });
        if(arr[0].equals("0")) return "0";
        StringBuilder sb=new StringBuilder();
        for(String s:arr)
        {
            sb.append(s);
        }
        return sb.toString();
    }
}