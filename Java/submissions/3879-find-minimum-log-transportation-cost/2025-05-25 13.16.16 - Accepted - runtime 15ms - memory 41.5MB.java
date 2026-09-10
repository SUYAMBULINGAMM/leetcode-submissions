class Solution {
    public long minCuttingCost(int n, int m, int k) {
        if(n<=k && m<=k)
            return 0;
        return IntStream.of(n, m)
                .filter(log -> log > k)
                .mapToLong(log -> IntStream.range(1, log)
                        .filter(cut -> cut <= k && (log - cut) <= k)
                        .mapToLong(cut -> (long) cut * (log - cut))
                        .min().orElse(Long.MAX_VALUE))
                .min().orElse(0);
    }
}