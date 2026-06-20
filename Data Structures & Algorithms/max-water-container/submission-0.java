class Solution {
    public int maxArea(int[] heights) {
        int result = 0;
        int start=0,end = heights.length -1;

        while(start < end){
            result = Math.max(result , Math.min(heights[start], heights[end])*(end-start));
            if(heights[start]<heights[end]){
                start+=1;
            }else{
                end-=1;
            }
        }
        return result;
        
    }
}
