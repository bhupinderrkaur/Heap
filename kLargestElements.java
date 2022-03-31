class Solution {
    int[] kLargest(int[] arr, int n, int k) {
       
       int[] b = new int[k];
       PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());

       for(int i=0;i<n;i++){
          pq.add(arr[i]);
        }

        for(int j=0;j<k;j++)
        {
        int p= pq.peek();
        pq.remove();
        b[j]=p;
        }

        return b;

    }
}
