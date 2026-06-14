class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        freq = {}
        result = []
        for num in nums:
            freq[num] = freq.get(num,0)+1
        freq = dict(sorted(freq.items(), key=lambda x: x[1], reverse=True))
        print(freq)
        result = list(freq.keys())
        return result[:k]

        