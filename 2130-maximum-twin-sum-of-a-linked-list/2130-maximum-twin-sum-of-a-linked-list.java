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
    public int pairSum(ListNode head) {
        List<Integer> aa=new ArrayList();
        while(head!=null){
            aa.add(head.val);
            head=head.next;
        }
        int n=aa.size();
        int maxTwin=0;
        for(int i=0;i<n;i++){
            if(n-1-i>0){
                int twin=aa.get(i)+aa.get(n-1-i);
              maxTwin=  Math.max(twin,maxTwin);
            }
        }
        return maxTwin;
        
    }
}