import package1.Solution;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();

        Solution test = new Solution(inputString);
        if(test.isValid()) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}