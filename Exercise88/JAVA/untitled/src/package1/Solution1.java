package package1;

import java.util.Arrays;

public class Solution1 {
    int[] num1;
    int[] num2;

    int m,n;

    public Solution1(int[] num1, int m, int[] num2, int n){
        this.num1 = num1;
        this.m = m;
        this.num2 = num2;
        this.n = n;
    }

    void swap(int j, int i) {
        int temp = num1[j];
        num1[j] = num2[i];
        num2[i] = temp;
    }

    public void merge() {
        int j;
        for(int i = 0; i < n; i ++) {
            for(j = 0; j < m + i; j++){
                if(num1[j] > num2[i]){
                    swap(j, i);
                }
            }
            swap(j, i);
        }
    }

    public void printNum1() {
        System.out.println(Arrays.toString(num1));
    }
}
