class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False;
        fres = {}
        for char in s:
            fres[char] = fres.get(char, 0) +1
        
        for char in t:
            fres[char] = fres.get(char,0) -1;
            if fres[char] < 0:
                return False
        
        print(fres)
        
        for key ,value in fres.items():
            if value != 0:
                return False
        return True
        
        
        