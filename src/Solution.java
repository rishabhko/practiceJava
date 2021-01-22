class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if(head.next==null)
        {
            return null;
        }
        if (head.next.next==null&& n==2)
        {
            return head.next;
        }
        ListNode first=head;
        ListNode second=head;
        for(int i=0;i<n;i++)
        {
            if (second.next==null)
                break;
            second=second.next;
        }
        while(second.next!=null)
        {
            first=first.next;
            second=second.next;
        }

        first.next=first.next.next;

        return head;
    }

    public static void main(String[] args) {
//        ListNode three=new ListNode(1);
        ListNode two=new ListNode(2);
        ListNode one=new ListNode(1,two);

        Solution solution=new Solution();
        ListNode ans=solution.removeNthFromEnd(one,2);

       do {



            System.out.println(ans.val);
            ans=ans.next;
        }
       while (ans!=null);


    }
}