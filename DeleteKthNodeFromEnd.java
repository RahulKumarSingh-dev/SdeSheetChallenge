import java.util.* ;
import java.io.*; 

	
class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }
}



public class DeleteKthNodeFromEnd {
	public static LinkedListNode<Integer> removeKthNode(LinkedListNode<Integer> head, int k) {
		// Write your code here.
        if(head==null||head.next==null)return null;
        if(k==0)return head;
        LinkedListNode<Integer>slow=head,fast=head;
        boolean flag=false;
        for(int i=0;i<=k;i++){
            if(fast==null){
                flag=true;
                break;
            }
            fast=fast.next;
        }
        if(flag){
            head=head.next;
            return head;
        }
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return head;
	}
}
