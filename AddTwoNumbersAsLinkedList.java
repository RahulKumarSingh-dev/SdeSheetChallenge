import java.util.* ;
import java.io.*; 

class LinkedListNode {
    int data;
    LinkedListNode next;
    
    public LinkedListNode(int data) {
        this.data = data;
    }
}

public class AddTwoNumbersAsLinkedList {
    static LinkedListNode addTwoNumbers(LinkedListNode head1, LinkedListNode head2) {
        // Write your code here.
        LinkedListNode curr1=head1,curr2=head2,dn=new LinkedListNode(-1),curr=dn;
        int sum=0,carry=0;
        while(curr1!=null||curr2!=null||carry!=0){
            int a=(curr1==null)?0:curr1.data;
            int b=(curr2==null)?0:curr2.data;
            sum=a+b+carry;
            curr.next=new LinkedListNode(sum%10);
            carry=sum/10;
            curr=curr.next;
            if(curr1!=null)curr1=curr1.next;
            if(curr2!=null)curr2=curr2.next;
        }
        return dn.next;
    }
}
