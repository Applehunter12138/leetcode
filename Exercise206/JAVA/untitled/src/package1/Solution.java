package package1;

import package2.LinkList;

public class Solution<T> {
    LinkList<T> linklist;

    public Solution(LinkList<T> linklist) {
        this.linklist = linklist;
    }

    public LinkList<T> reverseList() throws Exception {
        LinkList<T> result = new LinkList<>();

        for(int i = 0; i < linklist.size; i++) {
            result.insert(0, linklist.get(i).item);
        }

        return result;
    }
}
