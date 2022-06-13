import java.util.*;
public class RemoveDuplicateFromSortedArray {
	public static int removeDuplicates(ArrayList<Integer> arr,int n) {
		// Write your code here.
        int j=0;
        for(int i=0;i<n;i++){
            if(arr.get(i)!=arr.get(j)){
                j++;
                int temp=arr.get(i);
                arr.set(i,arr.get(j));
                arr.set(j,temp);
            }
        }
        return j+1;
	}
}
