import java.util.*;
class Solution {
    public int maxArea(int[] height) {
        int f=0;
        int t=height.length-1;
        int maxarea=0;
        while(f<=t){
            int width=t-f;
            int mheight=Math.min(height[f],height[t]);
            int carea=width*mheight;
            maxarea=Math.max(maxarea,carea);
            if(height[f]<height[t]){
                f++;
            }else{
                t--;
            }
        }
        return maxarea;
        
    }
}