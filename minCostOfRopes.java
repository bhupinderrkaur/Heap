class Solution
{
    //Function to return the minimum cost of connecting the ropes.
    long minCost(long arr[], int n) 
    {
        PriorityQueue<Long> minheap=new PriorityQueue<>();
        for(int i=0;i<n;i++){
            minheap.add(arr[i]);
        }
       long cost=0;
       while(minheap.size()>1){
           long f=minheap.poll();
           long s=minheap.poll();
           long temp=f+s;
           cost+=temp;
           
           minheap.add(temp);
       }
       return cost;
    }
    
}
