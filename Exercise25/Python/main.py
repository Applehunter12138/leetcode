import LinkList
import ListNode

class Solution():
    def __init__(self, linklist:LinkList) -> None:
        self.linklist = linklist

    def reverseKGroup(self, k:int) -> ListNode.ListNode:
        result = LinkList.LinkList()

        if k > self.linklist.size:
            print("ERROR: k can't be larger than the size of link list.")
            return None
        elif k < 1:
            print("ERROR: k can't be smaller than 1.")
            return None

        while self.linklist.head != None:
            for i in range(0, k):
                result.insertNode(result.size - i, self.linklist.head.data)
                self.linklist.head = self.linklist.head.next
                if self.linklist.head == None:
                    break

        return result.head

def main():
    linklist = LinkList.LinkList()
    for i in range(0, 5):
        linklist.insertNode(linklist.size, i+1)
    
    testInput = Solution(linklist)
    result = testInput.reverseKGroup(3)
    if result == None:
        return

    while result != None:
            print(result.data)
            result = result.next

if __name__ == '__main__':
    main()