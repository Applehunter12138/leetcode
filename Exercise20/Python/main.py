class Solution:
    def __init__(self, inputString) -> None:
        self.inputString = inputString
    
    def isValid(self) -> bool:
        if len(self.inputString) % 2 == 1 :
            return False
        
        pairs = {'}':'{'
                ,']':"["
                ,')':'('}

        leftBrackets = []

        for i in self.inputString:
            if i in pairs:
                if not leftBrackets or leftBrackets[-1] != pairs[i] :
                    return False
                leftBrackets.pop()
            else:
                leftBrackets.append(i)
            
        
        
        return not leftBrackets

def main():
    inputString = input("请输入：")
    testInput = Solution(inputString)
    if(testInput.isValid):
        print(True)
    else:
        print(False)

if __name__ == '__main__':
    main() 