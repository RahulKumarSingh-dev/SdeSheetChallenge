import java.util.*;
public class RatInAMaze {
    static ArrayList<ArrayList<Integer>>ans;
    static int dir[][]={{-1,0},{1,0},{0,-1},{0,1}};
    public static ArrayList<ArrayList<Integer>> ratInAMaze(int[][] arr, int n) {
        // Write your code here.
        ans=new ArrayList<>();
        int a[][]=new int[n][n];
        solve(arr,0,0,a);
        return ans;
    }
    public static void solve(int arr[][],int i,int j,int a[][]){
        if(!isValid(arr,i,j)||a[i][j]==1)return;
        a[i][j]=1;
        if(i==arr.length-1&&j==arr.length-1){
            ArrayList<Integer>temp=new ArrayList<>();
            for(int t[]:a){
                for(int e:t)temp.add(e);
            }
            ans.add(temp);
           
        }
        for(int d[]:dir){
            int ii=i+d[0],jj=j+d[1];
            solve(arr,ii,jj,a);
        }
        a[i][j]=0;
    }
    public static boolean isValid(int arr[][],int i,int j){
        int n=arr.length;
        if(i>=n||j>=n||i<0||j<0||arr[i][j]==0)return false;
        return true;
    }
    
}
