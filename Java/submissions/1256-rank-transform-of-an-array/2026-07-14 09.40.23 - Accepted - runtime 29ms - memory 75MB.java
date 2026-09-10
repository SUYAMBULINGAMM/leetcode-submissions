// import java.util.*;
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        /*int ans[]=new int[arr.length];
        int k=0;
        for(int i=0;i<arr.length;i++)
        {
            int r=1;
            for(int j=0;j<arr.length;j++)
            {
                if(i!=j)
                {
                    if(arr[i]>arr[j])
                    {
                        r++;
                    }
                }
            }
            ans[k]=r;
            k++;
        }
        return ans;*/
        int n = arr.length;
        int [] brr = arr.clone();
        Arrays.sort(brr);
        Map<Integer,Integer> map = new HashMap<>();
        int ind = 0;
        for(int i =0;i<n;i++){
            if(!map.containsKey(brr[i])){
                map.put(brr[i],ind++);
            }
        }
        //System.out.print(map);
        int [] crr = new int [n];
        for(int i = 0;i<n;i++){
            crr[i] = map.get(arr[i])+1;
        }
        return crr;



    }
}