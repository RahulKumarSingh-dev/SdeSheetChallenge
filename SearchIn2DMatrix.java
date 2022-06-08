import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class SearchIn2DMatrix{
    public static int findDuplicate(ArrayList<Integer> arr, int n){
        // Write your code here.
        for(int i=0;i<n;i++){
            int idx=Math.abs(arr.get(i));
            idx--;
            if(arr.get(idx)<0)return idx+1;
            arr.set(idx,-arr.get(idx));
        }
        return -1;
    }
}

