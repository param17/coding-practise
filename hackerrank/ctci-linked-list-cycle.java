//Linked Lists: Detect a Cycle
//https://www.hackerrank.com/challenges/ctci-linked-list-cycle/problem

/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/
boolean hasCycle(Node head) {
    if (head == null)
        return false;
    Node slow = head;
    Node fast = head.next;
    //int count = 0;
    while(fast.next!=null && fast.next.next != null && slow!=fast){
        //count++;
        //if(count > 101)
        //    return true;
        fast = fast.next.next;
        slow = slow.next;
    }
    if(fast!=null && fast==slow)
        return true;
    return false;
}
