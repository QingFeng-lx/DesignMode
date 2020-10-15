package test.test2;

public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode cur=head.next;
        System.out.println(cur);
       /* while (cur!=null){

        }*/

        return null;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2= new ListNode(2);
        ListNode node3 = new ListNode(3);
        Solution solution = new Solution();
        solution.reverseList(node1);
    }
}
