import java.util.* ;
import java.io.*; 
public class LongestSubstringWithoutRepeatingCharacter 
{
	public static int uniqueSubstrings(String s) 
    {
		//write your code here
        Map<Character,Integer>map=new HashMap<>();
        int i=0,ans=0;
        for(int j=0;j<s.length();j++){
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
            while(j-i+1!=map.size()){
                char chi=s.charAt(i);
                int f=map.get(chi);
                if(f==1)map.remove(chi);
                else map.put(chi,f-1);
                i++;
            }
            ans=Math.max(ans,j-i+1);
        }
        return ans;
	}
}

