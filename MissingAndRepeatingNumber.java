import java.util.ArrayList;

public class MissingAndRepeatingNumber {

    public static int[] missingAndRepeating(ArrayList<Integer> a, int n) {
        // Write your code here 
        int arr[]=new int[n];
        for(int i=0;i<n;i++)arr[i]=a.get(i);
        int num=0;
        for(int i=0;i<n;i++){
            num^=(i+1);
            num^=(arr[i]);
        }
        int setBit=0;
        while(((1<<setBit)&num)==0)setBit++;
        int b1=0,b2=0;
        for(int i=0;i<n;i++){
            if(isSet(arr[i],setBit))b1^=arr[i];
            else b2^=arr[i];
            if(isSet(i+1,setBit))b1^=(i+1);
            else b2^=(i+1);
        }
        int miss=b1,dup=b2;
        for(int e:arr){
            if(e==miss){
                miss=b2;
                dup=b1;
                break;
            }
        }
        return new int[]{miss,dup};
    }
    public static boolean isSet(int n,int bit){
        return ((1<<bit)&n)!=0;
    }
}
