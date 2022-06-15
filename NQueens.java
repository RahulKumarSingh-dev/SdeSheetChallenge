import java.util.*;
public class NQueens {
    static ArrayList<ArrayList<Integer>>ans;
    public static ArrayList<ArrayList<Integer>> solveNQueens(int n) {
        // Write your code here.
        ans=new ArrayList<>();
        int chess[][]=new int[n][n];
        solve(chess,0);
        return ans;
    }
    public static boolean isValid(int chess[][],int r,int c){
        for(int i=0;i<chess.length;i++){
            if(chess[r][i]==1||chess[i][c]==1)return false;
        }
        for(int i=r,j=c;i>=0&&j<chess.length;i--,j++){
            if(chess[i][j]==1)return false;
        }
        for(int i=r,j=c;i>=0&&j>=0;i--,j--){
            if(chess[i][j]==1)return false;
        }
        return true;
    }
    public static void solve(int chess[][],int r){
        if(r==chess.length){
            ArrayList<Integer>a=new ArrayList<>();
            for(int c[]:chess){
                for(int e:c)a.add(e);
            }
            ans.add(a);
            return;
        }
        for(int c=0;c<chess.length;c++){
            if(isValid(chess,r,c)){
                chess[r][c]=1;
                solve(chess,r+1);
                chess[r][c]=0;
            }
        }
    }
}
