package package1;

import java.util.LinkedList;
import java.util.Queue;

public class Solution1 {
    boolean solution;
    public Solution1() {
        this.solution = true;
    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length - k + 1];
        int result_index = 0;
        int max = 0;
        Queue<Integer> window = new LinkedList<>();

        if (nums.length > 0) {
            max = nums[0];
        }
        for(int i = 0; i < k && i < nums.length; i++) {
            window.add(nums[i]);
            if(nums[i] > max) {
                max = nums[i];
            }
        }
        result[result_index] = max;
        result_index++;

        for(int j = k; j < nums.length; j++) {
            int out = window.remove();
            window.add(nums[j]);


            if(nums[j] > max && out != max) {
                max = nums[j];
            } else if (out == max) {
                int queueMax = window.element();
                for(int m = 0; m < k; m++){
                    int temp = window.remove();
                    if (temp > queueMax) {
                        queueMax = temp;
                    }
                    window.add(temp);
                }
                max = queueMax;
            }

            result[result_index] = max;
            result_index++;
        }

        return result;
    }
}
