import Package1.Solution;
import Package2.LinkList;
import Package2.Node;

public class Main {
    public static void main(String[] args) throws Exception {
        LinkList<Integer> linkList = new LinkList<>();

        for(int i = 0; i < 5; i++) {
            linkList.insert(i, i+1);
        }
        linkList.tail.next = linkList.head.next;

        Solution<Integer> testInput = new Solution<>(linkList);
        Node<Integer> position = testInput.detectCycle(linkList.head);

        System.out.println(position.item);
    }
}