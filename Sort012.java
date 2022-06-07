import java.util.* ;
import java.io.*; 
public class Sort012 
{
    public static void sort012(int[] arr)
    {
        //Write your code here
        int n=arr.length;
        int i=0,j=0,k=n-1;
        while(i<=k){
            if(arr[i]==0){
                swap(arr,i,j);
                j++;
                i++;
            }else if(arr[i]==2){
                swap(arr,i,k);
                k--;
            }else i++;
        }
    }
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
