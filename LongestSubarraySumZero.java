import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class LongestSubarraySumZero {
    public static int lengthOfLongestSubarraySumZero(int[] arr) {
        // Write your code here.
        int n=arr.length;
        int ans=0;
        int sum=0;
        int start=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            while(sum<0){
                sum+=arr[start++];
            }
            ans=Math.max(ans,i-start+1);
        }
        return ans;
    }

	public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {

		// Write your code here.
        Map<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);
        int sum=0,ans=0;
        for(int i=0;i<arr.size();i++){
            sum+=arr.get(i);
            ans=Math.max(ans,i-map.getOrDefault(sum,i));
            map.putIfAbsent(sum,i);
        }
        return ans;
	}
}
