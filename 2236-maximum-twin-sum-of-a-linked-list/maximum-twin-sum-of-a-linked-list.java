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
        int len=0;
        ListNode pointer=head;
        while(head!=null){
            len++;
            head=head.next;
        }
        int[] a=new int[(len/2)];
        int maxsum=0;
        for(int i=0;i<len/2;i++){
            a[i]=pointer.val;
            pointer=pointer.next;
        }
        for(int j=len/2-1;j>=0;j--){
           maxsum=Math.max(maxsum,a[j]+pointer.val);
            pointer=pointer.next;
        }
        return maxsum;
    }
}