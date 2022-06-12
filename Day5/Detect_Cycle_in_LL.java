public class Solution {
    public boolean hasCycle(ListNode head) {
  //Optimised floyed cycle algorithm
        // ListNode slow=head;
        // ListNode fast=head;
        // while(fast!=null && fast.next!=null){
        //     slow=slow.next;
        //     fast=fast.next.next;
        //     if(slow==fast)
        //     {
        //         return true;
        //     }
        // }
        // return false;
        
        //TC=O(N)   SC=O(1)
        
     //using hashset
     //TC=O(N)   SC=O(N)
        HashSet<ListNode> set=new HashSet<>();
        ListNode temp=head;
        while(temp!=null){
            if(set.contains(temp)){
                return true;
            }
            set.add(temp);
            temp=temp.next;
        }
        return false;
        
    }
}
