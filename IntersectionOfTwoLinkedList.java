import java.util.* ;
import java.io.*; 
/************************************
	 
	 //Following is the class structure of the LinkedListNode class:
	 
	  class LinkedListNode<T> {
		public T data;
		public LinkedListNode<T> next;
		
		public LinkedListNode(T data) {
			this.data = data;
			this.next = null;
		}
	}

*****************************************/
public class IntersectionOfTwoLinkedList {

	public static int findIntersection(LinkedListNode<Integer> firstHead, LinkedListNode<Integer> secondHead) {
		LinkedListNode<Integer>curr1=firstHead,curr2=secondHead;
        int cnt=0;
        while(curr1!=curr2){
            curr1=curr1.next;
            curr2=curr2.next;
            if(curr1==null){
                curr1=secondHead;
                cnt++;
                if(cnt==2)return -1;
            }
            if(curr2==null)curr2=firstHead;
        }
        return curr1.data;
	}
}
