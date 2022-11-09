'''
88. 合并两个有序数组

给你两个按 非递减顺序 排列的整数数组 nums1 和 nums2，另有两个整数 m 和 n ，分别表示 nums1 和 nums2 中的元素数目。

请你 合并 nums2 到 nums1 中，使合并后的数组同样按 非递减顺序 排列。

注意：最终，合并后数组不应由函数返回，而是存储在数组 nums1 中。为了应对这种情况，nums1 的初始长度为 m + n，其中前 m 个元素表示应合并的元素，后 n 个元素为 0 ，应忽略。nums2 的长度为 n 。

来源：力扣（LeetCode）
链接：https://leetcode.cn/problems/merge-sorted-array
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
'''

class Solution:
    def __init__(self, nums1:list, m, nums2:list, n) -> None:
        self.nums1 = nums1
        self.nums2 = nums2
        self.m = m
        self.n = n
    
    def merge(self) -> None:
        j = 0
        for i in range(self.m, self.m + self.n) :
            self.nums1[i] = self.nums2[j]
            j += 1
        self.nums1.sort()

def main():
    nums1 = [1,2,3,0,0,0]
    m = 3
    nums2 = [2,5,6]
    n = 3

    testInput = Solution(nums1, m, nums2, n)
    testInput.merge()
    print(testInput.nums1)

if __name__ == '__main__':
    main()
