/*
88. 合并两个有序数组

给你两个按 非递减顺序 排列的整数数组nums1 和 nums2，另有两个整数 m 和 n ，分别表示 nums1 和 nums2 中的元素数目。

请你 合并 nums2 到 nums1 中，使合并后的数组同样按 非递减顺序 排列。

注意：最终，合并后数组不应由函数返回，而是存储在数组 nums1 中。为了应对这种情况，nums1 的初始长度为 m + n，其中前 m 个元素表示应合并的元素，后 n 个元素为 0 ，应忽略。nums2 的长度为 n 。

来源：力扣（LeetCode）
链接：https://leetcode.cn/problems/merge-sorted-array
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
*/

import package1.Solution1;
import package1.Solution2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice;
        int[] num1 = {1,2,3,0,0,0};
        int m = 3;
        int[] num2 = {2,5,6};
        int n = 3;

        while(true) {
            System.out.println("Please enter your choice:");
            Scanner input = new Scanner(System.in);
            if (input.hasNextInt()) {
                choice = input.nextInt();
                break;
            } else {
                System.out.println("Please enter an integer.(1 or 2)");
            }
        }

        if(choice == 1) {
            System.out.println("We use solution1.");
            Solution1 solution1 = new Solution1(num1, m, num2, n);
            solution1.merge();
            solution1.printNum1();
        }
        else {
            System.out.println("We use solution2.");
            Solution2 solution2 = new Solution2(num1, m, num2, n);
            solution2.merge();
            solution2.printNum1();
        }
    }
}