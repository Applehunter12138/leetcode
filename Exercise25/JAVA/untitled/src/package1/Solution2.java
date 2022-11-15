package package1;

import package2.LinkList;
import package2.Node;

public class Solution2<T> {
    LinkList<T> linkList;

    public Solution2 (LinkList<T> linkList) {
        this.linkList = linkList;
    }

    public Node<T> reverseKGroup(int k) {
        Node<T> dummy = new Node<>(null, linkList.head);
        Node<T> pre = dummy;
        Node<T> next;
        Node<T> end = pre;
        Node<T> start;

        while(end.next != null) {
            for (int i = 0; i < k && end != null; i++) {
                end = end.next;
            }
            if (end == null) {
                break;
            }

            start = pre.next;
            next = end.next;
            end.next = null;

            pre.next = reverse(start);

            start.next = next;
            pre = start;
            end = pre;
        }

        return dummy.next;
    }

    private Node<T> reverse(Node<T> head) {
        Node<T> pre = null;
        Node<T> curr = head;
        while(curr != null) {
            Node<T> next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }
}
