import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class MajorityElement2 
{
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) 
    {
        // Write your code here.
        int ele1=0,ele2=0,cnt1=0,cnt2=0;
        for(int e:arr){
            if(ele1==e)cnt1++;
            else if(ele2==e)cnt2++;
            else if(cnt1==0){ele1=e;cnt1++;}
            else if(cnt2==0){ele2=e;cnt2++;}
            else {cnt1--;cnt2--;}
        }
        cnt1=0;cnt2=0;
        for(int e:arr){
            if(ele1==e)cnt1++;
            else if(ele2==e)cnt2++;
        }
        int n=arr.size();
        ArrayList<Integer>ans=new ArrayList<>();
        if(cnt1>n/3)ans.add(ele1);
        if(cnt2>n/3)ans.add(ele2);
        return ans;
    }
}
