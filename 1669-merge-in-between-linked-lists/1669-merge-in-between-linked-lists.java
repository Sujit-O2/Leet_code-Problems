/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {

        ListNode ll=list1;
        for(int i=0;i<a-1;i++){
            ll=ll.next;
        }
        ListNode l2=ll.next;
        for(int i=0;i<b-a+1;i++){
            l2=l2.next;
        }
        ll.next=list2;
        while(ll.next!=null){
            ll=ll.next;

        }
        ll.next=l2;
        return list1;
    }
}