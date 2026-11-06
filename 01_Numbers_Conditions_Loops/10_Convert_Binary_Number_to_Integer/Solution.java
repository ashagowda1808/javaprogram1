class Solution {
    public int getDecimalValue(ListNode head) {
        int value=0;
        ListNode current=head;
        while(current!=null){
            value=value*2+current.val;
            current=current.next;
        }
        return value;
    }
}
