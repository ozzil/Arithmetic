package binaryTree;

public class BinaryTree_Test1 {
    //main
    public static void main(String[] args) {
        preOrderTest1();
    }
    /*Part1
     *preorder recursion
     *
     *@param 
     */
    public static void preOrderTest1() 
    {
        TreeNode[] nodes = new TreeNode[9];

        for(int i = 0; i < nodes.length; i++) 
        {
            nodes[i] = new TreeNode(i + 1);
        }
        for(int i = 0; i <nodes.length; i++) 
        {                
            //ここの設定は固定値の設定ではなく、参照オブジェクトの設定になるため、
            //結果的にnode[0]へすべての子分岐を入れる
            if(i*2+1 < 9) 
            {   
                nodes[i].left = nodes[i*2+1];
            }
            if(i*2+2 < 9) 
            {
                nodes[i].right = nodes[i*2+2];
            }
        }
        preorderRecursion(nodes[0]);
    }
    /*Part1
     *preorder recursion 
     *@param BinaryTree
     */
    public static void preorderRecursion(TreeNode biTree) 
    {
        System.out.println(biTree.value);
        TreeNode leftTree = biTree.left;
        TreeNode rightTree = biTree.right;
        if(leftTree != null) 
            //再帰で値を設定
        {   
            preorderRecursion(leftTree);
        }
        if(rightTree != null) 
        {
            preorderRecursion(rightTree);
        }
    }
//preorder traversal non-recursion

}
class TreeNode
{
    int value;
    TreeNode left;
    TreeNode right;
    TreeNode(int value) 
    {
        // TODO Auto-generated constructor stub
        this.value = value;
    }
}