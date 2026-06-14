class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        is_present = {}
        result = []
        for str in strs:
            sorted_str = "".join(sorted(str))
            if sorted_str in is_present:
                is_present.get(sorted_str).append(str)
            else:
                is_present[sorted_str] = [str]
        
        # for key, value in is_present.items():
        #     result.append(value)
        return list(is_present.values())

        