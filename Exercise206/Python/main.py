import LinkList

class Solution():
    def __init__(self, linklist:LinkList) -> None:
        self.linklist = linklist

    def reverseList(self) -> LinkList:
        result = LinkList.LinkList()
        for i in range(0, self.linklist.size):
            result.insertNode(0, self.linklist.get(i).data)
        return result

def main():
    linklist = LinkList.LinkList()
    for i in range(0, 5):
        linklist.insertNode(linklist.size, i+1)
    
    testInput = Solution(linklist)
    result = testInput.reverseList()
    result.travel()

if __name__ == '__main__':
    main()