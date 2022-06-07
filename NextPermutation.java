import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.Collections;

public class NextPermutation 
{
	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> arr) 
	{
		// Write your code here.
        int n=arr.size();
        int dipIdx=n-2;
        while(dipIdx>=0&&arr.get(dipIdx)>=arr.get(dipIdx+1))dipIdx--;
        if(dipIdx==-1){
            Collections.sort(arr);
            return arr;
        }
        int greaterIdx=n-1;
        while(arr.get(greaterIdx)<=arr.get(dipIdx))greaterIdx--;
        int temp=arr.get(dipIdx);
        arr.set(dipIdx,arr.get(greaterIdx));
        arr.set(greaterIdx,temp);
        int i=dipIdx+1,j=n-1;
        while(i<j){
             temp=arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
            i++;
            j--;
        }
        return arr;
	}
}

