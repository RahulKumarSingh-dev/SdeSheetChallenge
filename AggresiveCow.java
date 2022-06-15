import java.util.*;
public class AggresiveCow {

    public static int chessTournament(int[] arr, int n,  int c) {
        // Write your code here. 
        Arrays.sort(arr);
        int lo=1,hi=arr[n-1]-arr[0],ans=0;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            int cnt=1,prev=arr[0];
            for(int i=1;i<n;i++){
                if(arr[i]-prev>=mid){
                    cnt++;
                    prev=arr[i];
                }
            }
            if(cnt>=c){
                lo=mid+1;
                ans=mid;
            }else hi=mid-1;
        }
        return ans;
    }

}