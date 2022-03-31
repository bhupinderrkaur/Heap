class Solution
{
    //Function to merge K sorted linked list.
   
   Node mergeKList(Node[]arr,int k)
   {
       PriorityQueue<Node> pq=new PriorityQueue<Node>((a,b)->a.data-b.data);
       for(int i=0;i<k;i++){
           pq.offer(arr[i]);
       }
       Node dummy=new Node(0);
       Node head=dummy;
       while(pq.isEmpty()!=true){
           Node top=pq.peek();
           pq.poll();
           if(top.next!=null)pq.offer(top.next);
           dummy.next=top;
           dummy=dummy.next;
       }
       dummy.next=null;
       return head.next;
   }
}
