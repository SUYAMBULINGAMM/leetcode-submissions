    class Solution{
    public long minSum(int[] A, int[] B) {
        long sa = 0, sb = 0, a0 = 0, b0 = 0;
        for (int a: A) {
            a0 += a > 0 ? 0: 1;
            sa += Math.max(a, 1);
        }
        for (int b: B) {
            b0 += b > 0 ? 0: 1;
            sb += Math.max(b, 1);
        }
        if (sa < sb && a0 == 0) return -1;
        if (sa > sb && b0 == 0) return -1;
        return Math.max(sa, sb);
    }
    }