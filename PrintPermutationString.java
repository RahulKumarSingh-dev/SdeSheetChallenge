import java.util.*;
public class PrintPermutationString {
    static List<String>ans;
    public static List<String> findPermutations(String s) {
        // Write your code here.
        ans=new ArrayList<>();
        char arr[]=s.toCharArray();
        solve(arr,0);
        return ans;
    }
    public static void solve(char arr[],int idx){
        if(idx==arr.length){
            String s="";
            for(char ch:arr)s+=ch;
            ans.add(s);
            return;
        }
        for(int i=idx;i<arr.length;i++){
            swap(arr,i,idx);
            solve(arr,idx+1);
            swap(arr,i,idx);
        }
    }
    public static void swap(char arr[],int i,int j){
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
