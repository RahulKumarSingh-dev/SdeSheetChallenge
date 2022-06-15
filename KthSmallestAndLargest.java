import java.util.*;


public class KthSmallestAndLargest {
	public static ArrayList<Integer> kthSmallLarge(ArrayList<Integer> arr, int n, int k) {
		//Write your code here
        PriorityQueue<Integer>min=new PriorityQueue<>();
        PriorityQueue<Integer>max=new PriorityQueue<>((a,b)->b-a);
        for(int e:arr){
            min.add(e);
            max.add(e);
            if(min.size()>k){
                min.remove();
                max.remove();
            }
        }
        return new ArrayList<>(Arrays.asList(max.peek(),min.peek()));

	}
}

