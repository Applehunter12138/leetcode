class ListNode:
    def __init__(self, data) -> None:
        self.data = data
        self.next = None
    
    def hasValue(self, value) -> bool:
        if self.data == value:
            return True
        else:
            return False
            