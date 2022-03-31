class Solution
{
    //Function to merge k sorted arrays.
    static class Pair{
        int data;
        int i;
        int row;
        
       public Pair(int data,int i,int row){
            this.data=data;
            this.i=i;
            this.row=row;
        }
    }
    public static ArrayList<Integer> mergeKArrays(int[][] arr,int K) 
    {
     ArrayList<Integer> ans=new ArrayList<>();
     PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->(a.data-b.data));
        for(int j=0;j<arr.length;j++){
            pq.add(new Pair(arr[j][0],0,j));
        }
        while(!pq.isEmpty()){
            Pair first=pq.remove();
            ans.add(first.data);
            first.i++;
            if(first.i<arr[first.row].length){
                first.data=arr[first.row][first.i];
               pq.add(first) ;
            }
        }
        return ans;
        
    }
}
