package package1;

import java.util.Arrays;

public class Solution {
    int[] nums = null;

    public Solution(int[] nums){
        this.nums = nums;
    }

    public int removeDuplicates() {
        int slow = 0;
        int fast = 1;

        while(fast < nums.length) {
            if(nums[slow] != nums[fast]){
                slow = slow + 1;
                nums[slow] = nums[fast];
            }
            fast = fast + 1;
        }

        return slow + 1;
    }

    public void setNums(int[] nums) {
        this.nums = nums;
    }

    public void printNums() {
        System.out.println(Arrays.toString(this.nums));
    }
}
