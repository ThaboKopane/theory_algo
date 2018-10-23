public class binaryT{

    public boolean isBalanced(Node bTree){
        //for the height of the left subtree
        int lst;
        //for the height of the right subreee
        int rst;

        //null checker
        if(bTree == null)
            return true;
        
        //call the height method for the tree
        lst = height(bTree.left);
        rst = height(bTree.right);

        if(Math.abs(lst-rst) <= 1 && isBalanced(bTree.left) && isBalanced(bTree.right))
            return true;
        
        

        return false;
    }

    public boolean isBST(Node bTree, int min, int max){
        if(node == null)
            return true;
        
        if(node.data < min || node.data > max)
            return flase;

        return (isBST(bTree.left, min, node.data-1) && isBST(bTree.right, node.data+1, max));
    }
}