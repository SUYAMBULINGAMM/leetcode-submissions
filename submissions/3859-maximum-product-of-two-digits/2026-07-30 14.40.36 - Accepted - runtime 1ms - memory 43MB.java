class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> arr=new ArrayList<>();
        while(n>0)
        {
            int digit=n%10;
            arr.add(digit);
            n/=10;
        }
        int max1=0,max2=0;
        for(int i=0;i<arr.size();i++)
        {
            if(arr.get(i)>max1)
            {
                max2=max1;
                max1=arr.get(i);
            }
            else if(arr.get(i)>max2)
            {
                max2=arr.get(i);
            }
        }
        return (max1*max2);
    }
}