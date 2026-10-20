/*
 * DATE:15/10/2026
 *
 * PROBLEM LINK: https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list/problem?isFullScreen=true
 * PROBLEM STATEMENT:print the elements in the linked list
 * __________________________________________________
 * 
 * __________________________________________________
 *
 * INSIGHTS GAINED FROM THIS QUESTION:
 * new predefined variables in java for DSA programs 
 * __________________________________________________
 * adding nodes to the list and printing it 
 * __________________________________________________
 *
 */

import java.util.*;

public class node{

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    static void printLinkedList(SinglyLinkedListNode head) {
      SinglyLinkedListNode current =head;
      while(current!=null){
        System.out.println(current.data);
        current =current.next;
      }

    }

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        SinglyLinkedList llist = new SinglyLinkedList();

        int llistCount = sc.nextInt();
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < llistCount; i++) {
            int llistItem = sc.nextInt();
            sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            llist.insertNode(llistItem);
        }

        printLinkedList(llist.head);

        sc.close();
    }
}
