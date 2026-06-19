class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i =0 ;i < nums.length; i++){
            int start = i+1 , end = nums.length-1;
            while(start < end){
                int sum = nums[i] + nums[start] + nums[end];
                if(sum == 0){
                    result.add(Arrays.asList(nums[i],nums[start], nums[end]));
                    while(start+1 < end && nums[start+1] == nums[start] ){
                        start+=1;
                    }
                    while(start< end-1 && nums[end-1] == nums[end]){
                        end-=1;
                    }
                    start+=1; end-=1;
                }else if(sum < 0){
                    start+=1;
                }else{
                    end-=1;
                }
            }
            while(i+1< nums.length && nums[i] == nums[i+1]){
                i+=1;
            }
        }
        // if(result.size() == 0) return new int[0][];
        // int[][] r = new int[result.size()][result[0].size()];

        // for(int i=0 ;i < result.size() ;i++){
        //     for(int j=0 ;j<result[0].size() ; j++){
        //         r[i][j] = result.get(i).get(j);
        //     }
        // }
        return result;
        
    }
}
