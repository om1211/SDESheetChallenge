public class Solution {
    public ListNode detectCycle(ListNode head) {
        
    //brute force approach (using hashtable)
    //TC=O(N) SC=O(N)
        // HashSet<ListNode> set=new HashSet<>();
        // while(head!=null){
        //     if(set.contains(head)){
        //         return head;
        //     }
        //     set.add(head);
        //     head=head.next;
        // }
        // return null;
        
        
    //optimised two pointer
        ////TC=O(N) SC=O(1)
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                fast=head;
                while(fast!=slow)
                {
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;
            }
            
        }
        return null;
    }
}
