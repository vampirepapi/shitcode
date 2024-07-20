class Solution:
    def minPartitions(self, n: str) -> int:
        return max(map(int, n))

main = Solution()
print(main.minPartitions("32")) # 3
