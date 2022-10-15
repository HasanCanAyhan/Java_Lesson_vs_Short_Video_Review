package algorithmQuestions.intersectionofTwoLinkedLists;

import java.util.HashSet;
import java.util.Set;

//https://youtu.be/c7dOI-hDa2Q

public class IntersectionOfTwoLinkedLists {

    public static ListNode getIntersectionNode_twoPointer(ListNode headA, ListNode headB) {

        //if (headA == null || headB == null) return null;

        ListNode pointer1 = headA;
        ListNode pointer2 = headB;

        while (pointer1 != pointer2){

            pointer1 = pointer1.next;
            pointer2 = pointer2.next;

            if (pointer1 == null) {
                pointer1 = headB;
            }

            if (pointer2 == null){
                pointer2 = headA;
            }

            if (pointer1 == pointer2) return pointer1;


        }


        return pointer1;


    }

    public static ListNode withSetTwoLoop(ListNode headA, ListNode headB){

        Set<ListNode> set = new HashSet<>();
        ListNode currentA = headA;
        ListNode currentB = headB;

        while (currentA != null){
            set.add(currentA);
            currentA = currentA.next;
        }

        while(currentB != null){
            if(set.contains(currentB)) return currentB;
            currentB = currentB.next;
        }

        return null;

    }

    public static ListNode withFindingLength(ListNode headA, ListNode headB){
        /*
        Find size of them
        sizeA = 5
        sizeB = 3
        Find the difference of sizes
        diff = sizeA – sizeB = 2
        Move currentA 2 times
        Move currentA & currentB together and check if
        they are equals
         */
        if (headA == null || headB == null) return null;

        int sizeA = getLength(headA), sizeB = getLength(headB);
        ListNode currentA = headA, currentB = headB;

        if (sizeA > sizeB) {
            int diff = sizeA - sizeB;
            for (int i = 1; i <= diff; i++) {
                currentA = currentA.next;
            }
        } else {
            int diff = sizeB - sizeA;
            for (int i = 1; i <= diff; i++) {
                currentB = currentB.next;
            }
        }

        while (currentA != null && currentB != null){
            if (currentA == currentB) return currentA;
            currentA = currentA.next;
            currentB = currentB.next;
        }
        return null;


    }

    public static int getLength(ListNode head) {
        ListNode temp = head;
        int size = 0;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        return size;
    }

















}
