package package1;

import package2.LinkList;
import package2.Node;

public class Solution<T> {
    LinkList<T> linkList;

    public Solution (LinkList<T> linkList) {
        this.linkList = linkList;
    }

    public Node<T> reverseKGroup(int k) throws Exception {
        LinkList<T> result = new LinkList<>();

        if(k > linkList.size) {
            System.out.println("ERROR: k can't be larger than the size of the link list.");
            return null;
        }

        if(k <= 0) {
            System.out.println("ERROR: k can't be smaller than 1.");
            return null;
        }

        while(linkList.head != null) {
            for (int i = 0; i < k; i++) {
                result.insert(result.size - i, linkList.head.item);
                linkList.head = linkList.head.next;
                if(linkList.head == null) break;
            }
        }

        return result.head;
    }
}
