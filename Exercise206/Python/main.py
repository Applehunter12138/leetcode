import LinkList

class Solution():
    def __init__(self, linklist:LinkList) -> None:
        self.linklist = linklist

    def reverseList(self) -> LinkList:
        result = LinkList()
        for i in range(0, self.linklist.size):
            result.insertNode(0, self.linklist.get(i))
        return result

def main():
    linklist = LinkList()
    for i in range(0, 5):
        linklist.insertNode(0, i+1)
    
    testInput = Solution(linklist)
    result = testInput.reverseList()
    result.travel()

if __name__ == '__main__':
    main()