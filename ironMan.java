import java.util.Scanner;
import java.util.*;
class ironMan {
  static int[] findTheRange(int N, ArrayList<ArrayList<Integer>> planets){
       int[] nn = new int[N];
       for(int u = 0;u<N;u++){
           nn[u] = 0;
       }
       int i,j;
       int maxi = 0;
       int index = 0;
       for(i=0;i<planets.size();i++){
           int k = planets.get(i).get(0);
           int l = planets.get(i).get(1);
           int m = planets.get(i).get(2);
           for(j=k;j<l;j++){
               nn[j] = nn[j]+m;
               if(maxi<nn[j]){
                  maxi= nn[j];
                  index = j;
               }
           }
       }
       int[] result = {index,index+1,maxi};
       return result;
  }
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     int N = sc.nextInt();
     int len = sc.nextInt();
     ArrayList<ArrayList<Integer>> planets = new ArrayList<ArrayList<Integer>>();
     int k =0;
      
     while(k<len){
          ArrayList<Integer> planet = new ArrayList<Integer>();
          planet.add(0,sc.nextInt());
          planet.add(1,sc.nextInt());
          planet.add(2,sc.nextInt());
          planets.add(planet);
          k++;
     }
    int [] jj = findTheRange(N, planets);
    for(int g = 0;g<3;g++){
      System.out.print(jj[g]+ " ");
    }
  }
}