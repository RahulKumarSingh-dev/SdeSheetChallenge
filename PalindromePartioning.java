import java.util.*;
public class PalindromePartioning {
    static List<List<String>>ans;
    public static List<List<String>> partition(String s) {
        // Write your code here.
        ans=new ArrayList<>();
        solve(s,0,new ArrayList<>());
        return ans;
    }
    private static void solve(String s,int idx,List<String>a){
        if(idx==s.length()){
            ans.add(new ArrayList<>(a));
            return ;
        }
        String temp="";
        for(int i=idx;i<s.length();i++){
            char ch=s.charAt(i);
            temp+=ch;
            if(isPalin(temp)){
                a.add(temp);
                solve(s,i+1,a);
                a.remove(a.size()-1);
            }
        }
    }
    private static boolean isPalin(String s){
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))return false;
            i++;
            j--;
        }
        return true;
    }
}
