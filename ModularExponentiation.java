import java.util.* ;
import java.io.*; 
public class ModularExponentiation {
    public static int modularExponentiation(int x, int n, int mod) {
        // Write your code here.        
        long ans=1;
        long base=(long)x;
        while(n!=0){
            if(n%2==1){
                ans=(ans*base)%mod;
                n--;
            }else{
                base=(base*base)%mod;
                n/=2;
            }
        }
        return (int)(ans%mod);
    }
}
