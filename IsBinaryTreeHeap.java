class Solution {
    boolean isHeap(Node tree) {
        if(tree==null) return true;
        int n=size(tree);
        boolean ans = isheap(tree,0,n);
        return ans;
    }
    int size(Node root){
        if(root==null)return 0;
        return 1+size(root.left)+size(root.right);
    }
    boolean isheap(Node root,int index,int n){
        if(root==null)return true;
        if(index>=n)return false; //complete binary check
        if(root.left!=null && root.left.data>=root.data||
        root.right!=null &&root.right.data>=root.data)return false;
       //is maxheap check
        return isheap(root.left,2*index+1,n)&& isheap(root.right,2*index+2,n);
    }
}
