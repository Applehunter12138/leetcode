package package1;

public class Solution1 {
    int solution;

    public Solution1() {
        this.solution = 0;
    }

    public int largestRectangleArea(int[] heights) {
        int largestArea = 0;
        int area;
        int wide = 1;
        int m = 1, n = 1;
        for(int i = 0; i < heights.length; i++) {
            while(m != -1 || n != -1) {
                if(i - m >= 0 && m != -1) {
                    if(heights[i - m] < heights[i]) {
                        wide = wide + m - 1;
                        m = -1;
                    }
                } else if(m != -1) {
                    wide = wide + m - 1;
                    m = -1;
                }
                if(i + n < heights.length && n != -1) {
                    if(heights[i + n] < heights[i]) {
                        wide = wide + n - 1;
                        n = -1;
                    }
                }else if(n != -1){
                    wide = wide + n - 1;
                    n = -1;
                }

                if(m != -1) m = m + 1;
                if(n != -1) n = n + 1;
            }

            area = heights[i] * wide;
            if(area > largestArea) {
                largestArea = area;
            }

            wide = 1;
            m = 1;
            n = 1;
        }
        return largestArea;
    }
}
