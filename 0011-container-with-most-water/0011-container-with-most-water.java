class Solution {
    public int maxArea(int[] height) {
        int left =0;
        int right= height.length-1;
        int MaxArea=0;
        int CurrentArea=0;

        while(left<right){
            CurrentArea =(int)(Math.min(height[left], height[right])*(right-left));
            MaxArea = Math.max(CurrentArea, MaxArea);
            if(height[left]<=height[right]){
                left++;
            }else if(height[left]>=height[right]){
                right--;
            }
        }
        return MaxArea;
        
    }
}