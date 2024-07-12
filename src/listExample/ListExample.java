package listExample;

public class ListExample {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       ListNode dummy=new ListNode(-1);
       ListNode current=dummy;
       while (list1!=null && list2!=null){
           if (list1.val <= list2.val){
               current.next=list1;
               list1=list1.next;

           }else {
               current.next=list2;
           }
           current = current.next;
       }
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        // Return the merged list starting from the next of dummy node
        return dummy.next;
    }
    }

