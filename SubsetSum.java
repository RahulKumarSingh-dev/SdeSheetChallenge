import java.util.*;
public class SubsetSum {
    public static ArrayList<Integer> subsetSum(int arr[]) {
        // Write your code here..
        int n=arr.length;
        ArrayList<Integer>ans=new ArrayList<>();
        for(int mask=0;mask<(1<<n);mask++){
            int sum=0;
            for(int j=0;j<n;j++){
                if((mask&(1<<j))!=0){
                    sum+=arr[j];
                }
            }
            ans.add(sum);
        }
        Collections.sort(ans);
        return ans;
    }

}
