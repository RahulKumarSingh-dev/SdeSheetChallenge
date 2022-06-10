import java.util.* ;
import java.io.*; 
/*
	Following is the structure of the Singly Linked List.	
	class LinkedListNode<T> 
    {
    	T data;
    	LinkedListNode<T> next;
    	public LinkedListNode(T data) 
        {
        	this.data = data;
    	}
	}

*/
class LinkedListNode<T> 
{
  T data;
  LinkedListNode<T> next;
  public LinkedListNode(T data) 
    {
    this.data = data;
  }
}
public class ReverseLinkedList 
{
    public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head) 
    {
        // Write your code here!
        LinkedListNode<Integer>curr=head,prev=null,frw=null;
        while(curr!=null){
            frw=curr.next;
            curr.next=prev;
            prev=curr;
            curr=frw;
        }
        return prev;
    }
}
