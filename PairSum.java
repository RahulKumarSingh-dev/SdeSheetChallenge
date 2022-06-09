import java.util.* ;
import java.io.*; 
public class PairSum{
    public static int[][] pairSum(int[] arr, int s) {
        // Write your code here.
        Arrays.sort(arr);
        List<int[]>res=new ArrayList<>();
        int n=arr.length;
        int i=0,j=n-1;
        while(i<j){
            if(arr[i]+arr[j]==s){
                int a=arr[i],b=arr[j],cnta=0,cntb=0;
                while(arr[i]==a){i++;cnta++;}
                while(arr[j]==b){j--;cntb++;}
                int limit=(a==b)?(cnta*(cnta-1))/2:(cnta*cntb);
                for(int k=0;k<limit;k++)res.add(new int[]{a,b});
            }else if(arr[i]+arr[j]<s)i++;
            else j--;
        }
        int ans[][]=new int[res.size()][2];
        for( i=0;i<res.size();i++)ans[i]=res.get(i);
        return ans;
    }
}
