package com.yankun.hw1;

public class MergeTwoSortedLists {

    public static void main(String[] args) {
        ListNode list1 = new ListNode();
        list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode();
        list2= new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        printLL(mergeTwoLists(list1, list2));

    }
    static class ListNode {
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next){ this.val = val; this.next = next;}
    }

    public static void printLL(ListNode head){
        ListNode ptr = head;
        while(ptr != null){
            System.out.print(ptr.val + " -> ");
            ptr = ptr.next;
        }
        System.out.print("null");
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2){
        ListNode p1 = list1;
        ListNode p2 = list2;
        ListNode list = new ListNode();
        ListNode ptr = list;
        while(p1 != null && p2 != null){
            if(p1.val < p2.val){
                ListNode add = new ListNode(p1.val);
                ptr = add;
                ptr = ptr.next;
                p1 = p1.next;
            } else {
                ListNode add = new ListNode(p2.val);
                ptr = add;
                ptr = ptr.next;
                p2 = p2.next;
            }
        }
        if(p1 == null){
            while(p2 != null){
                ListNode add = new ListNode(p2.val);
                ptr = add;
                ptr = ptr.next;
                p2 = p2.next;
            }
        }
        if (p2 == null) {
            while(p1 != null){
                ListNode add = new ListNode(p1.val);
                ptr = add;
                ptr = ptr.next;
                p1 = p1.next;
            }
        }
        return list;
    }


}
