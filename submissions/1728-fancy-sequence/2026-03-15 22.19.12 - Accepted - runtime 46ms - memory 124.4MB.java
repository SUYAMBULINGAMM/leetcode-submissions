class Fancy {
    private static final long MOD=1_000_000_007;
    private List<Long> seq;
    private long mul;
    private long add;
    public Fancy() {
        seq=new ArrayList<>();
        mul=1;
        add=0;
    }
    
    public void append(int val) {
        long normalized = (val - add + MOD) % MOD;
        normalized = (normalized * modInverse(mul)) % MOD;
        seq.add(normalized);
        
    }
    
    public void addAll(int inc) {
        add = (add + inc) % MOD;
        
    }
    
    public void multAll(int m) {
        mul = (mul * m) % MOD;
        add = (add * m) % MOD;
        
    }
    
    public int getIndex(int idx) {
        if(idx >= seq.size()) return -1;
        long val = seq.get(idx);
        long result = (val * mul % MOD + add) % MOD;
        return (int) result;
    }
    private long modInverse(long x)
    {
        return modpow(x, MOD - 2);
    }
    private long modpow(long base,long exp)
    {
        long res=1;
        base %= MOD;
        while(exp > 0)
        {
            if((exp & 1) == 1) 
            {
                res =  (res * base ) % MOD;
            }
            base = (base * base ) % MOD;
            exp>>=1;
        }
        return res;
    }
}

/**
 * Your Fancy object will be instantiated and called as such:
 * Fancy obj = new Fancy();
 * obj.append(val);
 * obj.addAll(inc);
 * obj.multAll(m);
 * int param_4 = obj.getIndex(idx);
 */