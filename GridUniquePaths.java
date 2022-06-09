import java.util.* ;
import java.io.*; 
public class GridUniquePaths {
	public static int uniquePaths(int m, int n) {
		// Write your code here.
        int N=m+n-2;
        int r=m-1;
        double res=1.0;
        for(int i=1;i<=r;i++){
            res=res*(N-r+i)*1.0/i;
        }
        return (int)res;
	}
}
