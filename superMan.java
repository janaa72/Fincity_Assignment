import java.util.*;
class superMan {

   static int findPlanet(float[][][] tdArray, float[] minmax){
       int len = tdArray.length;
       int i;
       for(i=0;i<len;i++){
           int k = tdArray[i].length;
           int j=0;
           float total = 0.0f;
           while(j<k){
               total += (tdArray[i][j][0]/tdArray[i][j][1]);
               j++;
           }
           //System.out.println(total);
           if(total>=minmax[0] && total<=minmax[1]){
                return i;
                
           }
         
       }
       return -1;
   }
   public static void main(String args[]){
      
       
       float[][][] f = {{{0.433f, 200f}},{{0.89f,400f},{0.6f,300f}}};
      
       float[] f2 = {0.003f,0.005f};
       int result = findPlanet(f,f2);
       System.out.print(result);
   }
}