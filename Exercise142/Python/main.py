import LinkList
import ListNode

class Solution():
    def __init__(self, linklist:LinkList) -> None:
        self.linklist = linklist
    
    def detectCycle(self, head):
        fast, slow = head, head
        while True:
            if not (fast and fast.next): return
            fast, slow = fast.next.next, slow.next
            if fast == slow: break
        fast = head
        while fast != slow:
            fast, slow = fast.next, slow.next
        return fast

def main():
    linklist = LinkList.LinkList()
    for i in range(0, 5):
        linklist.insertNode(linklist.size, i+1)
    linklist.tail.next = linklist.head.next
    
    testInput = Solution(linklist)
    result = testInput.detectCycle(linklist.head)
    if result == None:
        return

    print(result.data)

if __name__ == '__main__':
    main()