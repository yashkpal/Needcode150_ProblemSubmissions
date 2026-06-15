class Solution {
    public int[] productExceptSelf(int[] nums) {
        int total = 1;
        int zeros = 0;
        int index = -1;
        for(int i =0 ; i<nums.length;i++){
            if(nums[i] == 0){ 
                zeros++;
                index = i;
            }
            else total*=nums[i];
        }

        if(zeros >=2) return new int[nums.length];
        int[] result = new int[nums.length];
        if(zeros == 1){
            result[index] = total;
            return result;
        }
        for(int i=0 ;i< nums.length;i++){
            result[i] = total/nums[i];
        }
        return result;
        
    }
}  
