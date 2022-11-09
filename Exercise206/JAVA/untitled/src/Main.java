import package1.Solution;
import package2.LinkList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        LinkList<Integer> linkList = new LinkList<>();
        LinkList<Integer> result;
        List<Integer> testOutput = new ArrayList<>();

        for(int i = 0; i < 5; i++) {
            linkList.insert(i, i+1);
        }

        Solution<Integer> testInput = new Solution<>(linkList);
        result = testInput.reverseList();
        for(int j = 0; j < result.size; j++) {
            testOutput.add(result.get(j).item);
            //System.out.println(result.get(j).item);
        }

        System.out.println(testOutput);
        System.out.println(result.size);
    }
}