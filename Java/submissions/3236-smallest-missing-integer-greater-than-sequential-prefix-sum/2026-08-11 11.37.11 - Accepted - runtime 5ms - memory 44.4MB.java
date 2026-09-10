class Solution {
    public static int check(int n,int []arr,int k)
    { 
        for(int i=k;i<arr.length;i++)
        {
            if(arr[i] == n)
            {
                return check(n+1,arr,i);
            }
        }
        return n;
    }
    public int missingInteger(int[] arr) {
        int n=arr.length;
        int sum=0;
        boolean f=false;
        for(int i=1;i<n;i++)
        {
            sum+=arr[i-1];
            if(arr[i]-arr[i-1] != 1)
            {
                f=true;
                break;
            }
        }
        if(f)
        {
            Arrays.sort(arr);
            return (check(sum,arr,0));
        }
        else
        {
            if(n == 1)
            {
                return arr[n-1]+1;
            }
            return sum+arr[n-1];
        }
    }
}