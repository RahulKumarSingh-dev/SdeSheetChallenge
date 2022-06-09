import java.util.* ;
import java.io.*; 
public class FourSum {
  public static String fourSum(int[] arr, int target, int n) {
      // Write your code here.
      Map<Integer,int[]>map=new HashMap<>();
      for(int i=0;i<n;i++){
          for(int j=i+1;j<n;j++)map.put(arr[i]+arr[j],new int[]{i,j});
      }
      for(int i=0;i<n;i++){
          for(int j=i+1;j<n;j++){
              int t=target-arr[i]-arr[j];
              if(map.containsKey(t)){
                  if(j<map.get(t)[0])return "Yes";
              }
          }
      }
      return "No";
  }
}

