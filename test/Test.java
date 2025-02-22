package test;

import main.*;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        M_2_AddTwoNumbers test = new M_2_AddTwoNumbers();

        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(4);
        ListNode listNode3 = new ListNode(3);
        listNode1.next = listNode2;
        listNode2.next = listNode3;

        ListNode listNode4 = new ListNode(5);
        ListNode listNode5 = new ListNode(6);
        ListNode listNode6 = new ListNode(4);
        listNode4.next = listNode5;
        listNode5.next = listNode6;

        System.out.println(test.addTwoNumbers(listNode1, listNode4).val);
    }
}