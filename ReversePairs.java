import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class ReversePairs 
{
    public static int reversePairs(ArrayList<Integer> A) 
    {
        // Write your code here.
        int n=A.size();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)arr[i]=A.get(i);
        return solve(arr,0,n-1,new int[n]);
    }
    public static int solve(int arr[],int i,int j,int temp[]){
        if(i>=j)return 0;
        int mid=(i+j)/2;
        return solve(arr,i,mid,temp)+solve(arr,mid+1,j,temp)+merge(arr,i,mid,j,temp);
    }
    public static int merge(int arr[],int left,int mid,int right,int temp[]){
        int i=left,j=mid+1,ans=0;
        while(i<=mid){
            while(j<=right&&arr[i]>2*arr[j])j++;
            i++;
            ans+=(j-mid-1);
        }
        i=left;j=mid+1;
        int k=left;
        while(i<=mid&&j<=right){
            if(arr[i]<arr[j])temp[k++]=arr[i++];
            else temp[k++]=arr[j++];
        }
        while(i<=mid)temp[k++]=arr[i++];
        while(j<=right)temp[k++]=arr[j++];
        for(i=left;i<=right;i++)arr[i]=temp[i];
        
        return ans;
    }
}
