import java.util.HashMap;
import java.util.HashSet;

public class DeleteNodefronArray {
    
}
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
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode result=new ListNode(0,head);
        HashSet<Integer> hh=new HashSet<>();

        for(int num:nums){
            hh.add(num);
        }
        ListNode dum=result;
        while(dum.next!=null){
            if(hh.contains(dum.next.val)){
                dum.next=dum.next.next;
            }
            else{
                dum=dum.next;
            }
        }
        
        
        return result.next;
        
    }
}