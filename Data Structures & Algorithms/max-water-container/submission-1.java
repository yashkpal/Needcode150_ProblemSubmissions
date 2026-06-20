class Solution {
    public int maxArea(int[] heights) {
        int result = 0;
        int start=0,end = heights.length -1;

        while(start < end){
            if(heights[start]<heights[end]){
                result = Math.max(result , heights[start]*(end-start));
                start+=1;
            }else{
                result = Math.max(result , heights[end]*(end-start));
                end-=1;
            }
        }
        return result;
        
    }
}
