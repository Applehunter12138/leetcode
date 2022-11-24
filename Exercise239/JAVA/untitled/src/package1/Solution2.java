package package1;

import java.util.*;

public class Solution2 {
    boolean solution;
    public Solution2() {
        this.solution = true;
    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length - k + 1];
        int result_index = 0;
        int max = 0;
        Queue<Integer> window = new LinkedList<>();
        List<Integer> windowData = new ArrayList<Integer>();

        if (nums.length > 0) {
            max = nums[0];
        }
        for(int i = 0; i < k && i < nums.length; i++) {
            window.add(nums[i]);
            windowData.add(nums[i]);
            if(nums[i] > max) {
                max = nums[i];
            }
        }
        result[result_index] = max;
        result_index++;

        for(int j = k; j < nums.length; j++) {
            int out = window.remove();
            windowData.remove(0);
            window.add(nums[j]);
            windowData.add(nums[j]);


            if(nums[j] > max && out != max) {
                max = nums[j];
            } else if (out == max) {
                max = Collections.max(windowData);
            }

            result[result_index] = max;
            result_index++;
        }

        return result;
    }
}
