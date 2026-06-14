class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        is_present = defaultdict(list)
        result = []
        for str in strs:
            sorted_str = "".join(sorted(str))
            is_present[sorted_str].append(str)
        return list(is_present.values())

        