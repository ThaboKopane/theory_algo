public class mergeLink{

    public Node MergeList(Node headA, Node headB){
        if(headA == null)
            return headB;
        if(headB == null)
            return headA;
        if(headA.data < headB.data){
            headA.next = MergeList(headA.next, headB);
            return headA;
        }
        else{
            headB.next = MergeList(headA, headB.next);
            return headB;
        }
    }
}