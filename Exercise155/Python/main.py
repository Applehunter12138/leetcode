class MinStack:
    def __init__(self) -> None:
        self.data = []
        self.minNumber = []
        self.length = 0
    
    def push(self, val: int) -> None:
        self.data.append(val)
        if self.length == 0:
            self.minNumber.append(val)
        else:
            if self.minNumber[self.length - 1] > val:
                self.minNumber.append(val)
            else:
                self.minNumber.append(self.minNumber[self.length - 1])
        self.length += 1
    
    def pop(self) -> None:
        if(self.length == 0):
            print("ERROR! Stack is null!")
        else:
            self.data.pop()
            self.minNumber.pop()
            self.length -= 1
    
    def top(self) -> int:
        if(self.length == 0):
            print("ERROR! Stack is null!")
            return None
        else:
            return self.data[-1]
    
    def getMin(self) -> int:
        if(self.length == 0):
            print("ERROR! Stack is null!")
            return None
        else:
            return self.minNumber[-1]

def main():
    stack = MinStack()
    stack.push(1)
    stack.push(2)
    print(stack.getMin())
    stack.push(-1)
    print(stack.getMin())
    stack.pop()
    print(stack.getMin())
    print(stack.top())

if __name__ == '__main__':
    main() 