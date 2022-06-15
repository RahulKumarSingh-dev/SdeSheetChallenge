import java.util.* ;
import java.io.*; 
public class ThreeSum {

	public static ArrayList<ArrayList<Integer>> findTriplets(int[] arr, int n, int k)  {

	    // Write your code here.
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        for(int i=0;i<n-2;i++){
            if(i!=0&&arr[i]==arr[i-1])continue;
            int lo=i+1,hi=n-1;
            while(lo<hi){
                int sum=arr[i]+arr[lo]+arr[hi];
                if(sum<k)lo++;
                else if(sum>k)hi--;
                else{
                    ans.add(new ArrayList<>(Arrays.asList(arr[i],arr[lo],arr[hi])));
                    lo++;
                    hi--;
                    while(lo<hi&&arr[lo]==arr[lo-1])lo++;
                    while(lo<hi&&arr[hi]==arr[hi+1])hi--;
                }
            }
        }
return ans;
	}
}
