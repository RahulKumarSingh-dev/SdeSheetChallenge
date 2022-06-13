import java.util.*;

public class CombinationSum2 
{
    static ArrayList<ArrayList<Integer>>ans;
    public static ArrayList<ArrayList<Integer>> combinationSum2(ArrayList<Integer> arr, int n, int target)
    {
        //    Write your code here.
        ans=new ArrayList<>();
        Collections.sort(arr);
        solve(arr,0,target,new ArrayList<>());
        return ans;
    }
    private static void solve(ArrayList<Integer> arr, int idx, int target,ArrayList<Integer> a){
          if(target==0)ans.add(new ArrayList<>(a));
            
        for(int i=idx;i<arr.size();i++){
            if(i!=idx&&arr.get(i)==arr.get(i-1))continue;
            if(arr.get(i)<=target){
                a.add(arr.get(i));
                solve(arr,i+1,target-arr.get(i),a);
                a.remove(a.size()-1);
            }
        }
    }
}
