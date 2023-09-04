class Aray{
     public static int trapedRainWater(int height[]){
          int trapedWater=0;
          int len= height.length;
          //left max for all arrays 
          int leftMax[]=new int[len];
          leftMax[0]=height[0];
          for(int i=1; i<len; i++){
               leftMax[i]=Math.max(height[i], leftMax[i-1]);
          }
          //right max for all arrays
          int rightMax[]=new int[len];
          rightMax[len-1]=height[len-1];
          for(int i=len-2; i>=0; i--){
               rightMax[i]=Math.max(height[i], rightMax[i+1]);
          }
          //loop
          for(int i=0; i<len; i++){
               //waterlevel = min(left , right )
               int waterlevel = Math.min(leftMax[i], rightMax[i]);
               //trappedwater = waterlevel - height[]
               trapedWater = (waterlevel - height[i])+trapedWater;
          }
          return trapedWater;
     }
     public static void main(String[] args) {
          int height[] = {4,2,0,6,3,2,5};//Rain water trap
          System.out.println(trapedRainWater(height));
     }
}