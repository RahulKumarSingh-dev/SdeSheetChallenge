import java.util.* ;
import java.io.*; 
public class TrappingRainWater {
    public static long getTrappedWater(long[] arr, int n) {
        // Write your code here.
        int i=0,j=n-1;
        long leftmax=Long.MIN_VALUE,rightmax=leftmax;
        long water=0;
        while(i<j){
            if(arr[i]<arr[j]){
                if(arr[i]<=leftmax)water+=(leftmax-arr[i]);
                else leftmax=arr[i];
                i++;
            }else{
                if(arr[j]<=rightmax)water+=(rightmax-arr[j]);
                else rightmax=arr[j];
                j--;
            }
        }
        return water;
    }
}
