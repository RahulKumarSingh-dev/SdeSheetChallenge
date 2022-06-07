import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class BestTimeToBuyAndSellStock{
    public static int maximumProfit(ArrayList<Integer> prices){
        // Write your code here.
        int min=prices.get(0);
        int ans=0;
        for(int e:prices){
            min=Math.min(min,e);
            ans=Math.max(ans,e-min);
        }
        return ans;
    }
}