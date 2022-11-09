package package1;

import java.util.Arrays;

public class Solution {
    int[] nums;

    public Solution(int[] nums){
        this.nums = nums;
    }

    public void moveZeroes() {
        int slow = 0;
        int fast = 0;
        int temp;

        while(fast < nums.length) {
            if(nums[fast] != 0){
                temp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = temp;
                slow ++;
            }
            fast ++;
        }
    }

    public void printNums() {
        System.out.println(Arrays.toString(this.nums));
    }

}
