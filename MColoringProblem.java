public class MColoringProblem {
	public static String graphColoring(int[][] adj, int m) {
		// Write your code here
        if(solve(adj,0,adj.length,new int[adj.length],m))return "YES";
        return "NO";
	}
    private static boolean solve(int adj[][],int node,int n,int color[],int m){
        if(node==n)return true;
        for(int i=1;i<=m;i++){
            if(isValid(adj,node,color,i)){
                color[node]=i;
                if(solve(adj,node+1,n,color,m))return true;
                color[node]=0;
            }
        }
        return false;
    }
    private static boolean isValid(int adj[][],int node,int color[],int c){
        int nei[]=adj[node];
        for(int i=0;i<nei.length;i++){
            if(nei[i]==1&&color[i]==c)return false;
        }
        return true;
    }
}

