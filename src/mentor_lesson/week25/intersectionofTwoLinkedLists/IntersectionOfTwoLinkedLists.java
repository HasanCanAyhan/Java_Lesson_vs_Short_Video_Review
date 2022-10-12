package mentor_lesson.week25.intersectionofTwoLinkedLists;

import java.util.*;

//https://youtu.be/c7dOI-hDa2Q

public class IntersectionOfTwoLinkedLists {

    public static void main(String[] args) {

    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

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

    public static ListNode getIntersectionNode2(ListNode headA, ListNode headB) {

        //if (headA == null || headB == null) return null;

        //calculate length
        //find difference
        //find larger length linked list
        // move larger nodes in larger linked list
        // then move one step each in both linked lists



        int countA = 0;
        while (headA != null){
            countA++;
            headA = headA.next;
        }

        int countB = 0;
        while (headB != null){
            countB++;
            headB = headB.next;
        }

        ListNode pointer1 ;
        ListNode pointer2 ;


        int findDifferent = Math.abs(countB - countA);


        if (countA < countB)  {
            pointer1 = headA;
            pointer2 = headB;
        }else{
            pointer1 = headB;
            pointer2 = headA;
        }

        int cnt = 0;
        while (cnt < findDifferent){
            pointer2 = pointer2.next;
            cnt++;
        }

        while (pointer1 != pointer2){
            pointer2 = pointer2.next;
            pointer1 = pointer1.next;
        }

        return  pointer1;

    }


}
