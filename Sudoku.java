public class Sudoku {

	public static boolean isItSudoku(int sudoku[][]) {

		// Write your code here.
        return solve(sudoku,0,0);
	}
    private static boolean solve(int sudoku[][],int r,int c){
        if(r==sudoku.length)return true;
        int nextr=r,nextc=c+1;
        if(c==sudoku.length-1){
            nextc=0;
            nextr=r+1;
        }
        if(sudoku[r][c]!=0)return solve(sudoku,nextr,nextc);
        for(int n=1;n<=9;n++){
            if(isValid(sudoku,r,c,n)){
                sudoku[r][c]=n;
                if(solve(sudoku,nextr,nextc))return true;
                sudoku[r][c]=0;
            }
        }
        return false;
    }
    private static boolean isValid(int sudoku[][],int r,int c,int n){
        for(int i=0;i<sudoku.length;i++){
            if(sudoku[i][c]==n||sudoku[r][i]==n)return false;
            int subi=3*(r/3)+i/3,subj=3*(c/3)+i%3;
            if(sudoku[subi][subj]==n)return false;
        }
        return true;
    }
}

