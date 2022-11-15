import package1.Solution;
import package1.Solution2;
import package2.LinkList;
import package2.Node;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        LinkList<Integer> linkList = new LinkList<>();
        Node<Integer> result;
        List<Integer> testOutput = new ArrayList<>();

        for(int i = 0; i < 5; i++) {
            linkList.insert(i, i+1);
        }

        Solution2<Integer> testInput = new Solution2<>(linkList);
        result = testInput.reverseKGroup(3);

        if(result == null) {
            return;
        }

        for(int j = 0; j < 5; j++) {
            testOutput.add(result.item);
            result = result.next;
        }

        System.out.println(testOutput);
    }
}