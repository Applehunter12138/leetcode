import package1.Solution;

public class Main {
    public static void main(String[] args) {
        int[] testInput = new int[]{1,1,2};
        int testOutput;

        Solution nums = new Solution(testInput);
        testOutput = nums.removeDuplicates();

        nums.printNums();
        System.out.println(testOutput);
    }
}