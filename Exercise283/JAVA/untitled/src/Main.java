import package1.Solution;

public class Main {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        Solution testInput = new Solution(nums);

        testInput.moveZeroes();

        testInput.printNums();
    }
}