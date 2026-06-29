class Solution {
    public boolean checkInclusion(String s1, String s2) {
          int start = 0, end = s1.length();
          if(s2.length() < s1.length()) return false;

          Map<Character,Integer> s1fre = new HashMap<>();
          Map<Character,Integer> s2fre = new HashMap<>();

          for(int i =0 ; i< s1.length() ;i++){
            s1fre.put(s1.charAt(i) , s1fre.getOrDefault(s1.charAt(i),0)+1);
            s2fre.put(s2.charAt(i) , s2fre.getOrDefault(s2.charAt(i),0)+1);
          }

          if(s1fre.equals(s2fre) == true) return true;

          while(end < s2.length()){
            s2fre.put(s2.charAt(end) , s2fre.getOrDefault(s2.charAt(end),0)+1);
            int val = s2fre.get(s2.charAt(start));
            if(val == 1){
                s2fre.remove(s2.charAt(start));
            }else{
                s2fre.put(s2.charAt(start), val-1);
            }
            end++;
            start++;
            if(s1fre.equals(s2fre) == true) return true;
          }
        return false;
    }
}
