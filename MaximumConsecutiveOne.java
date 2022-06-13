import java.util.ArrayList;

public class MaximumConsecutiveOne {
	public static int longestSubSeg(ArrayList<Integer> arr , int n, int k) {
		// Write your code here.
        int i=0,j=0,ans=0;
        int cnt[]=new int[2];
        while(j<n){
            cnt[arr.get(j)]++;
            while(cnt[0]>k){
                cnt[arr.get(i)]--;
                i++;
            }
            ans=Math.max(ans,j-i+1);
            j++;
               
        }
        return ans;
	}
}
