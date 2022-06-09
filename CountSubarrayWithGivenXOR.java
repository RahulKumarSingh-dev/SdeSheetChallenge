import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class CountSubarrayWithGivenXOR {
	public static int subarraysXor(ArrayList<Integer> arr, int x) {
		// Write your code here.
        Map<Integer,Integer>map=new HashMap<>();
        int n=arr.size();
        int xor=0,cnt=0;
        map.put(0,1);
        for(int e:arr){
            xor^=e;
            cnt+=map.getOrDefault((xor^x),0);
            map.put(xor,map.getOrDefault((xor),0)+1);
        }
        return cnt;
	}
}
