package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class M_2_AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummyHead = new ListNode(0); // Dummy head for result list
        ListNode current = dummyHead; // Pointer to construct result list
        int carry = 0; // Carry value for addition

        while (l1 != null || l2 != null || carry > 0) {
            int sum = carry; // Start with carry

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next; // Move to next node
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next; // Move to next node
            }

            carry = sum / 10; // Extract carry for next iteration
            current.next = new ListNode(sum % 10); // Store last digit of sum in new node
            current = current.next; // Move result list pointer
        }

        return dummyHead.next; // Return actual result (skip dummy node)

    }
}

//Example 1:
//Input: l1 = [2,4,3], l2 = [5,6,4]
//Output: [7,0,8]
//Explanation: 342 + 465 = 807.

//Example 2:
//Input: l1 = [0], l2 = [0]
//Output: [0]

//Example 3:
//Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
//Output: [8,9,9,9,0,0,0,1]


//Definition for singly-linked list.
//public class ListNode {
//    int val;
//    ListNode next;
//
//    ListNode() {
//    }
//
//    ListNode(int val) {
//        this.val = val;
//    }
//
//    ListNode(int val, ListNode next) {
//        this.val = val;
//        this.next = next;
//    }
//}
