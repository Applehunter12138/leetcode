package package1;

import java.util.Arrays;

public class Solution2 {
    int[] num1;
    int[] num2;

    int m,n;

    public Solution2(int[] num1, int m, int[] num2, int n){
        this.num1 = num1;
        this.m = m;
        this.num2 = num2;
        this.n = n;
    }

    public void merge() {
        for (int i = 0; i != n; ++i) {
            num1[m + i] = num2[i];
        }
        Arrays.sort(num1);
    }

    public void printNum1() {
        System.out.println(Arrays.toString(num1));
    }
}
