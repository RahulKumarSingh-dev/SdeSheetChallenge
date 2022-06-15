import java.util.*;

public class WordBreak2 {
    static ArrayList<String>ans;
    static Set<String>set;
	public static ArrayList<String> wordBreak(String s, ArrayList<String> d) {
		// Write your code here.
        ans=new ArrayList<>();
        set=new HashSet<>();
        for(String str:d)set.add(str);
        solve(s,0,"");
        return ans;
	}
    public static void solve(String s,int idx,String temp){
        if(idx==s.length()){
            ans.add(temp.substring(0,temp.length()-1));
            return;
        }
        String t="";
        for(int i=idx;i<s.length();i++){
            t+=s.charAt(i);
            if(set.contains(t)){
                solve(s,i+1,temp+t+" ");
            }
        }
    }
}
