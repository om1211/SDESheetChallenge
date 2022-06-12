class Solution {
    public boolean isPalindrome(ListNode head) {
        
    //Brute force
        // ArrayList<Integer> arr=new ArrayList<>();
        // while(head!=null)
        // {
        //     arr.add(head.val);
        //     head=head.next;
        // }  
        // for(int i=0;i<arr.size();i++){
        //     if(arr.get(i)!=arr.get(arr.size()-1-i)){
        //         return false;
        //     }
        // }
        // return true;
        
        
        //optimised solution
        if(head==null || head.next==null){
            return true;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=reverse(slow.next);
        slow=slow.next;
        ListNode dummy=head;
        while(slow!=null){
            if(dummy.val!=slow.val){
                return false;
            }
            dummy=dummy.next;
            slow=slow.next;
        }
        return true;
    }
    
    
    public static ListNode reverse(ListNode head){
        ListNode pre=null;
        ListNode nex=null;
        while(head!=null){
            nex=head.next;
            head.next=pre;
            pre=head;
            head=nex;
        }
        return pre;
    }
}
