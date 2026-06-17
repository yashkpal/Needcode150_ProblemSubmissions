class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length <= 1) return nums.length;
        Set<Integer> s = new TreeSet<>();

        for(int num : nums){
            s.add(num);
        }

        int result =1;
        int temp =1;
        for(int n : s){
            if(s.contains(n+1)){
                temp+=1;
                result = Math.max(temp , result);
            }else{
                temp =1;
            }
        }
        return result;
    }
}
