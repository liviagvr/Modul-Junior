package Curs21;

public class RotateList {

    public class ListNode {
        int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    class Solution {
        public ListNode rotateRight(ListNode head, int k) {

            if(k == 0 || head == null || head.next == null){
                return head;
            }
            int size = 0;
            ListNode tail = null;
            ListNode it = head;
            //connect the tail node to the head node
            while(it != null){
                size++;
                tail = it;
                it = it.next;

            }
            tail.next = head;


            k %= size;
            int rotate = size - k;
            tail = null;
            for(int i = 0; i < rotate; i++){
                tail = head;
                head = head.next;
            }
            tail.next = null;
            return head;
        }
    }
}
