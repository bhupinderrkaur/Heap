class Solution
{
    //Function to build a Heap from array.
    void buildHeap(int arr[], int n)
    {
        for(int i=n/2-1;i>=0;i--){
            heapify(arr,n,i);
        }
    }
 
    //Heapify function to maintain heap property.
    void heapify(int arr[], int n, int i)
    {
        int largest=i;
        int l=2*i+1;
        int r=2*i+2;
        if(l<n && arr[l]>arr[largest])
        largest=l;
        if(r<n && arr[r]>arr[largest])
        largest=r;
        if(i!=largest){
            int swap=arr[i];
            arr[i]=arr[largest];
            arr[largest]=swap;
            heapify(arr,n,largest);
        }
    }
    
    //Function to sort an array using Heap Sort.
    public void heapSort(int arr[], int n)
    {
        
        buildHeap(arr,n);
        
        for(int i=n-1;i>0;i--){
            int sw=arr[0];
            arr[0]=arr[i];
            arr[i]=sw;
            
            heapify(arr,i,0);
        }
    }
 }
 
