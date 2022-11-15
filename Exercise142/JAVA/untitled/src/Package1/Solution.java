package Package1;

import Package2.LinkList;
import Package2.Node;

public class Solution<T> {
    LinkList<T> linkList;

    public Solution (LinkList<T> linkList) {
        this.linkList = linkList;
    }

    public Node<T> detectCycle(Node<T> head) {
        Node<T> fast = head, slow = head;
        do {
            if (fast == null || fast.next == null) return null;
            fast = fast.next.next;
            slow = slow.next;
        } while (fast != slow);
        fast = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }

}
