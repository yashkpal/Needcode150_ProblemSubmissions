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
public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0, r = numbers.length - 1;

        while (l < r) {
            int curSum = numbers[l] + numbers[r];

            if (curSum > target) {
                r--;
            } else if (curSum < target) {
                l++;
            } else {
                return new int[] { l + 1, r + 1 };
            }
        }
        return new int[0];
    }
}