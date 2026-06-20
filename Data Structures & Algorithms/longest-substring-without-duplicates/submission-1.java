class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()<=1) return s.length();
        Set<Character> seen = new HashSet<>();
        seen.add(s.charAt(0));
        int high = 1, low = 0;
        int result = 1;

        while(high < s.length()){
            while(seen.contains(s.charAt(high)) && low < high){
                seen.remove(s.charAt(low));
                low++;
            }
            seen.add(s.charAt(high));
            high++;
            result = Math.max(seen.size(), result);
        }
        return result;
    }
}
