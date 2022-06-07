
public class MaximumSubarraySum {
	
	public static long maxSubarraySum(int[] arr, int n) {
		// write your code here
        long ans=0,csum=0;
        for(int e:arr){
            csum+=e;
            ans=Math.max(ans,csum);
            if(csum<0)csum=0;
        }
        return ans;
	}

}
