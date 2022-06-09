import java.util.* ;
import java.io.*; 
public class LongestConsecutiveSequence {
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        // Write your code here.
        int ans=0;
        Set<Integer>set=new HashSet<>();
        for(int e:arr)set.add(e);
        for(int e:set){
            if(!set.contains(e-1)){
                int cnt=0;
                while(set.contains(e)){
                    e++;
                    cnt++;
                }
                ans=Math.max(ans,cnt);
            }
        }
        return ans;
    }
}
