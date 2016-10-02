/**
 * Created by ScorpionOrange on 2016/10/01.
 *
 * 删除链表中等于给定值val的所有节点。
 * 样例
 * 给出链表 1->2->3->3->4->5->3, 和 val = 3, 你需要返回删除3之后的链表：1->2->4->5。
 *
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class ListNodeSolution {
    /**
     * @param head a ListNode
     * @param val an integer
     * @return a ListNode
     */
    public ListNode removeElements(ListNode head, int val) {
        // Write your code here
        ListNode result = head;
        if(head == null){
            return null;
        }
        while(head.next != null){
            if(head.next.val == val){
                if(head.next.next != null){
                    head.next = head.next.next;
                }
                else{
                    head.next = null;
                    break;
                }
            }
            else{
                head = head.next;
            }
        }
        if(result.val == val){
            return result.next;
        }
        return result;
    }
}
