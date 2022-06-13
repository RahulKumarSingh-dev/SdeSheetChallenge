import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the Node class:

        class Node
		{
		    public int data;
		    public Node next;

		    Node(int data)
		    {
		        this.data = data;
		        this.next = null;
		    }
		}

*****************************************************************/

public class LinkedListCycle2 
{
    public static Node firstNode(Node head) 
    {
        //    Write your code here.
        Node slow=head,fast=head;
        do{
            if(fast==null||fast.next==null)return null;
            slow=slow.next;
            fast=fast.next.next;
        }while(fast!=slow);
        fast=head;
        while(fast!=slow){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }
}
