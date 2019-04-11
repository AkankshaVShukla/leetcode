class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l1Next = l1;
        ListNode l2Next = l2;
        int cary=0;
        ListNode head = new ListNode(0);
        ListNode l3 = head;
        while(l1Next!=null || l2Next!=null){
            if(l1Next != null){
                cary += l1Next.val;
                l1Next=l1Next.next;
            }
            if(l2Next != null){
                cary += l2Next.val;
                l2Next=l2Next.next;
            }
            l3.next = new ListNode(cary%10);
            l3=l3.next;
            cary=cary/10;
        }
        if(cary!=0) l3.next = new ListNode(cary);
        return head.next;
    }
}
