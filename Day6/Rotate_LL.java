class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        
        //Brute force approach
               //   if (head == null || head.next == null) return head;
               //    for (int i = 0; i < k; i++) 
               //    {
               //        ListNode temp = head;
               //        while (temp.next.next != null) temp = temp.next;
               //        ListNode end = temp.next;
               //        temp.next = null;
               //        end.next = head;
               //        head = end;
               //    }
               // return head;
        
        
        //Optimised approach
        if(head==null || head.next==null){
            return head;
        }
        ListNode temp=head;
        int length=1;
        while(temp.next!=null){
            length+=1;
            temp=temp.next;
        }
        temp.next=head;
        k=k%length;
        int end=length-k;
        while(end--!=0){
            temp=temp.next;
        }
        head=temp.next;
        temp.next=null;
        return head;
    }
}
