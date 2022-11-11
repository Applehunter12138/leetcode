import ListNode

class LinkList:
    def __init__(self) -> None:
        self.head = None
        self.tail = None
        self.size = 0
    
    def get(self, index) -> ListNode:
        assert(index >= 0 and index <= self.size)
        temp = self.head

        for i in range(1, index + 1):
            temp = temp.next
        
        return temp


    def insertNode(self, index, item):
        assert(index >= 0 and index <= self.size)

        if not isinstance(item, ListNode.ListNode):
            item = ListNode.ListNode(item)
        
        if index == 0:
            if self.tail == None:
                self.tail = item
            else:
                item.next = self.head
            self.head = item
        elif index == self.size:
            if self.head == None:
                self.head = item
            else:
                self.tail.next = item
            self.tail = item
        else:
            prevNode = self.get(index - 1)
            item.next = prevNode.next
            prevNode.next = item
        
        self.size += 1

    def delNode(self, index):
        assert(index >= 0 and index <= self.size)

        if index == 0:
            self.head = self.head.next
        elif index == self.size:
            self.tail = self.get(self.size)
            self.tail.next = None
        else:
            prevNode = self.get(index - 1)
            prevNode.next = prevNode.next.next
        
        self.size -= 1

    def travel(self):
        """遍历链表"""
        cur = self.head

        while cur != None:
            print(cur.data)
            cur = cur.next
