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
    public void reorderList(ListNode head) {
        if(head == null) return;
        List<ListNode> arr = new ArrayList<>();
        ListNode dummy = head;
        while(head != null){
            arr.add(head);
            head = head.next;
        }
        int start = 0;
        int end = arr.size() - 1;
        while(start < end){
            arr.get(start).next = arr.get(end);
            start++;
            if(start >= end) break;
            arr.get(end).next = arr.get(start);
            end--;
        }
        arr.get(start).next = null;
    }
}
