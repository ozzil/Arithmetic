package binaryTree;

public class BinaryTree_Test1 {
    //main
    public static void main(String[] args) {
        TreeNode[] nodes = new TreeNode[10];

        for(int i = 0; i < nodes.length; i++) {
            nodes[i] = new TreeNode(i);
        }
        for(int i = 0; i <nodes.length; i++) {
            if(i*2+1 < 10) {
                nodes[i].left = nodes[i*2+1];
            }else if(i*2+2 < 10) {
                nodes[i].right = nodes[i*2+2];
            }
        }
        
        
    }
//preorder traversal non-recursion

    
}
class TreeNode{
    int value;
    TreeNode left;
    TreeNode right;
    TreeNode(int value) {
        // TODO Auto-generated constructor stub
        this.value = value;
    }
}