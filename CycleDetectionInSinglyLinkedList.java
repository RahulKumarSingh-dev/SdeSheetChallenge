import java.util.*;
import java.io.*;

class Node<T> {
  public T data;
  public Node<T> next;

  public Node(T data) {
    this.data = data;
    this.next = null;
  }
}

public class CycleDetectionInSinglyLinkedList {

  public static boolean detectCycle(Node<Integer> head) {
    // Your code goes here
    if (head == null || head.next == null)
      return false;
    Node<Integer> slow = head, fast = head;
    do {
      slow = slow.next;
      if (fast == null || fast.next == null)
        return false;
      fast = fast.next.next;

    } while (slow != fast);
    return true;
  }
}
