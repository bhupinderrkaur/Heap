class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        PriorityQueue<Integer> max=new PriorityQueue<>((a,b)->(b-a));
        for(int i=l;i<=r;i++){
            max.add(arr[i]);
            if(max.size()>k)
            max.poll();
        }
   return max.peek();  } 
   
}
