class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        freq = {}
        for i in range(len(nums)):
            next_tar = target - nums[i]
            if next_tar in freq:
                return [freq.get(next_tar) , i] 
            freq[nums[i]] = i
        return []
        
        
        