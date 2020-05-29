/**
 * @program: 20200518
 * @description
 * @author: Zhang Baolu
 * @create: 2020-05-18 16:54
 **/
class Node {
    public char val;
    public Node right;
    public Node left;
    public Node(char val) {
     this.val = val;
    }
}
public class BinaryTree {
    public Node buildTree() {
        Node A = new Node('A');
        Node B = new Node('B');
        Node C = new Node('C');
        Node D = new Node('D');
        Node E = new Node('E');
        Node F = new Node('F');
        Node G = new Node('G');
        Node H = new Node('H');

        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        E.right = H;
        C.left = F;
        C.right = G;

        return A;
    }

    //检查两颗树是否相同
    //另一颗树的子树
    //判断一颗二叉树是否是平衡二叉树
    //对称二叉树
}
