class Solution:
    def __init__(self) -> None:
        pass
    
    def largestRectangleArea(self, heights:list[int]) -> int:
        n = len(heights)
        left, right = [0] * n, [0] * n
        Stack = []

        for i in range(0, n):
            while len(Stack) > 0 and heights[Stack[-1]] >= heights[i] :
                Stack.pop()
            
            if len(Stack) == 0:
                left[i] = -1
            else:
                left[i] = Stack[-1]
            
            Stack.append(i)
        Stack.clear()

        for i in range(n-1, -1, -1):
            while len(Stack) > 0 and heights[Stack[-1]] >= heights[i] :
                Stack.pop()

            if len(Stack) == 0:
                right[i] = n
            else:
                right[i] = Stack[-1]
            
            Stack.append(i)
        Stack.clear()

        answer = 0
        for i in range(0, n):
            if (right[i] - left[i] - 1)*heights[i] > answer:
                answer = (right[i] - left[i] - 1)*heights[i]
        
        return answer

def main():
    data = [2,1,5,6,2,3]
    test = Solution()
    print(test.largestRectangleArea(data))

if __name__ == '__main__':
    main() 