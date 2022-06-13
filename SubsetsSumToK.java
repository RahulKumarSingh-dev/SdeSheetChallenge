import java.util.*;
public class SubsetsSumToK 
{
    static ArrayList<ArrayList<Integer>>ans;
    public static ArrayList<ArrayList<Integer>> findSubsetsThatSumToK(ArrayList<Integer> arr, int n, int k) 
	{
        // Write your code here.
        ans=new ArrayList<>();
        solve(arr,0,k,new ArrayList<>());
        return ans;
    }
    private static void solve(ArrayList<Integer> arr, int idx, int k,ArrayList<Integer>a){
        if(idx==arr.size()){
            if(k==0)ans.add(new ArrayList<>(a));
            return;
        }
        a.add(arr.get(idx));
        solve(arr,idx+1,k-arr.get(idx),a);
        a.remove(a.size()-1);
        solve(arr,idx+1,k,a);
    }
}
