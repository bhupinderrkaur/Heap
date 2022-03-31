class Solution{
   public int[] mergeHeaps(int[] a, int[] b, int n, int m) {
       // your code here
       int res[]=new int[n+m];

       for(int i=0;i<n;i++)
       {
           res[i]=a[i];
       }

       int j=0;
       for(int i=n;i<res.length;i++)
       {
           res[i]=b[j];
           j++;
       }

       for(int i=res.length/2-1;i>=0;i--)
       {
           heapfiy(res , res.length ,i);
       }
       return res;
   }
   
   static void heapfiy(int arr[] , int n , int i)
   {
       int largest=i;
       int left=2*i+2;
       int right=2*i+1;

       if(left < n && arr[left] > arr[largest])
       largest=left;

       if(right<n && arr[right] > arr[largest])
       largest=right;

       if(largest!=i)
       {
           int temp=arr[i];
           arr[i]=arr[largest];
           arr[largest]=temp;

           heapfiy(arr, n, largest);
       }
   }
}
