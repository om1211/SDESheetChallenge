/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
    //Brute Force
        // while(headB!=null){
        //     ListNode temp=headA;
        //     while(temp!=null){
        //         if(temp==headB){
        //             return headB;
        //         }
        //         temp=temp.next;
        //     }
        //     headB=headB.next;
        // }
        // return null;
        
        
        //1)Optimised using hashset
        HashSet<ListNode> set=new HashSet<>();
        while(headA!=null){
            set.add(headA);
            headA=headA.next;
        }
        while(headB!=null){
            if(set.contains(headB))
            {
                return headB;
            }
            headB=headB.next;
        }
        return null;
        
        
        //2)Optimised using pointer
//         if(headA == null || headB == null) return null;
//         ListNode a = headA;
//         ListNode b = headB;
//         while( a != b){

//             a = a == null? headB : a.next;
//             b = b == null? headA : b.next;    
//         }
//         return a;
    }
}
