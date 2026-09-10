class Solution {
    int[] nums;
    double k;
    int n;
    Map<List<Long>, Integer> dp = new HashMap<>();

    long gcd(long a, long b){
        if(a<b){
            long temp = a;
            a=b;
            b=temp;
        }

        if(b==0) return a;

        return gcd(b, a%b);
    } 

    int solve(long index, long mul, long div){
        long x = gcd(mul, div);
        mul/=x;
        div/=x;
        
        if(index==n){
            return mul == k*div ? 1 : 0;   
        }

        List<Long> temp = new ArrayList<>();
        temp.add(index);
        temp.add(mul);
        temp.add(div);

        if(dp.containsKey(temp)) return dp.get(temp);

        

        int ans = 0;
        ans += solve(index+1, mul*nums[(int)index], div);
        ans += solve(index+1, mul, div*nums[(int)index]);
        ans += solve(index+1, mul, div);

        dp.put(temp, ans);
        return ans;
    }
    
    public int countSequences(int[] nums, long k) {
        this.nums = nums;
        this.k = (double) k;
        n = nums.length;
        
        
        return solve(0, 1, 1);
    }
}