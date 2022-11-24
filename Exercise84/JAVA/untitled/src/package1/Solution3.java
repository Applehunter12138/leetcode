package package1;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution3 {
    int solution;

    public Solution3() {
        this.solution = 0;
    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            public int compare(int[] pair1, int[] pair2) {
                return pair1[0] != pair2[0] ? pair2[0] - pair1[0] : pair2[1] - pair1[1];
            }
        });
        for (int i = 0; i < k; ++i) {
            pq.offer(new int[]{nums[i], i});
        }
        int[] ans = new int[n - k + 1];
        assert pq.peek() != null;
        ans[0] = pq.peek()[0];

        for (int i = k; i < n; ++i) {
            pq.offer(new int[]{nums[i], i});
            while (true) {
                assert pq.peek() != null;
                if (!(pq.peek()[1] <= i - k)) break;
                pq.poll();
            }
            assert pq.peek() != null;
            ans[i - k + 1] = pq.peek()[0];
        }

        return ans;
    }

}
