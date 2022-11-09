/*
283. 移动零
给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。

请注意 ，必须在不复制数组的情况下原地对数组进行操作。
 */


import package1.Solution;

public class Main {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        Solution testInput = new Solution(nums);

        testInput.moveZeroes();

        testInput.printNums();
    }
}