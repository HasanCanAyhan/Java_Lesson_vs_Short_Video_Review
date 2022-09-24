package algorithmQuestions.MergeTwoSortedLL;

import algorithmQuestions.PrintMiddleLL.Node;

public class Solution {

    public static ListNode mergeTwoLists(ListNode curr1, ListNode curr2) {

        // create a dummy head Node;

        ListNode temp_head =  new ListNode();
        ListNode prev = temp_head;


        // 1 -> 2 -> 4 -> null
     //cr1                 ^
     //prev^

        // 1 -> 3 -> 5 -> null
    //cr2            ^
    //prev ^

        while(curr1 != null && curr2 != null){

            if (curr1.val <= curr2.val){

                prev.next = curr1;
                curr1 = curr1.next;

            }else{

                prev.next = curr2;
                curr2 = curr2.next;

            }
            prev = prev.next;



        }

        if (curr1 == null) prev.next = curr2;
        else prev.next = curr1;

        return temp_head.next;


    }



}
