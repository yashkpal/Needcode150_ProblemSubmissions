// class Solution {
//     public int[] twoSum(int[] numbers, int target) {
//         int start = 0 , end = numbers.length-1;

//         while(start < end){
//             int total = numbers[start] + numbers[end];
//             if(total == target) return new int[] {start+1 , end+1};
//             else if(total < target) start+=1;
//             else end-=1;
//         }
//         return new int[0];
//     }
// }
class Solution {
    public int[] twoSum(int[] nums, int target) {
            // sorted array track pair 

            int left = 0 , right = nums.length - 1; 

            while(left < right) {

                if(nums[left] + nums[right] > target) {
                    right--;
                }else if(nums[left] + nums[right] < target) {
                    left++;
                }else {
                    return new int[] {left + 1 , right + 1};
                }

            }

        return new int[2];
    }
}
