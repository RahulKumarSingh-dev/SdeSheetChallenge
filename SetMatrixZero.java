import java.util.* ;
import java.io.*; 
public class SetMatrixZero {
    public static void setZeros(int arr[][]) {
        // Write your code here..
        boolean isColZero=false;
        int n=arr.length,m=arr[0].length;
        for(int i=0;i<n;i++){
            if(arr[i][0]==0)isColZero=true;
            for(int j=1;j<m;j++){
                if(arr[i][j]==0){
                    arr[i][0]=0;
                    arr[0][j]=0;
                }
            }
        }
        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=1;j--){
                if(arr[i][0]==0||arr[0][j]==0)arr[i][j]=0;
            }
            if(isColZero)arr[i][0]=0;
        }
    }

}