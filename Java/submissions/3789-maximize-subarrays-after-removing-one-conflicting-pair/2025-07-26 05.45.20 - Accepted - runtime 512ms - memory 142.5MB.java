import java.util.*;

class Solution {
    public long maxSubarrays(int n, int[][] cp) {
        int m = cp.length;
        for (int i = 0; i < m; i++) {
            if (cp[i][0] > cp[i][1]) {
                int temp = cp[i][0];
                cp[i][0] = cp[i][1];
                cp[i][1] = temp;
            }
        }
        Arrays.sort(cp, Comparator.comparingInt(a -> a[0]));
        long[] contrib = new long[m];
        long ans = 1L * (n + 1) * n / 2;
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        int j = m - 1;
        for (int i = n; i >= 1; i--) {
            while (j >= 0 && cp[j][0] >= i) {
                pq.offer(new int[]{cp[j][1], j});
                j--;
            }
            if (pq.isEmpty()) continue;
            int[] item = pq.poll();
            int d = item[0], idx = item[1];
            ans -= n - d + 1;

            if (pq.isEmpty()) {
                contrib[idx] += n - d + 1;
            } else {
                int[] item2 = pq.peek();
                int d2 = item2[0];
                contrib[idx] += (d2 - 1 - d) + 1;
            }
            pq.offer(item);
        }

        long res = 0;
        for (int i = 0; i < m; i++) {
            res = Math.max(res, ans + contrib[i]);
        }
        return res;
    }
}
