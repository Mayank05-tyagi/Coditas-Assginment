class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        int k = lists.length;
        if(k==0){
            return null;
        } else if(k==1){
            return lists[0];
        }
        PriorityQueue<ListNode> heap = new PriorityQueue<>(k, (a,z) -> (a.val-z.val));
        
        for(int i=0;i<k;i++){
            if(lists[i]!=null) {
                heap.add(lists[i]);
            }
        }
        if(heap.isEmpty()){
            return null;
        }
        ListNode head = heap.remove();
        if(head.next!=null){
            heap.add(head.next);
        }
        ListNode current = head;
        while(!heap.isEmpty()) {
            ListNode next = heap.remove();
            if(next.next!=null) {
                heap.add(next.next);
            }
            current.next = next;
            current = current.next;
        }
        
        return head;
    }
}