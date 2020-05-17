/**
 * @program: 20200517
 * @description
 * @author: Zhang Baolu
 * @create: 2020-05-17 12:36
 **/
class Node {
    public char val;
    public Node left;
    public Node right;
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

    //前序遍历
    void preOrderTraversal(Node root) {
        if(root == null) {
            return ;
        }
        System.out.println(root.val + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    //中序遍历
    void inOrderTraversal(Node root) {
        if(root == null) {
            return ;
        }
        inOrderTraversal(root.left);
        System.out.println(root.val + " ");
        inOrderTraversal(root.right);
    }

    //后序遍历
    void postOrderTraversal(Node root) {
        if(root == null) {
            return ;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.println(root.val + " ");
    }

    //求节点个数(遍历思路）
    static int size = 0;
    void getSize1(Node root) {
        if(root == null) {
            return;
        }
        size++;
        getSize1(root.left);
        getSize1(root.right);
    }

    //求节点个数(子问题思路）
    int getSize2(Node root) {
        if(root == null) {
            return 0;
        }
        return getSize2(root.left) + getSize2(root.right)+1;
    }

    //遍历思路-求叶子结点个数
    static int leafSize = 0;
    void getLeafSize1(Node root){
        if(root == null) {
            return;
        }
        if(root.left == null && root.right == null) {
            leafSize++;
        }else {
            getLeafSize1(root.left);
            getLeafSize1(root.right);
        }
    }

    //问题思路-求叶子结点个数
    int getLeafSize2(Node root){
        if(root == null) {
            return 0;
        }
        if(root.left == null && root.right == null) {
            return 1;
        }
        return getLeafSize2(root.left)+getLeafSize2(root.right);
    }

    //获得二叉树高度
    int getHeight(Node root) {
        if(root == null) {
            return 0;
        }
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        return leftHeight > rightHeight ? leftHeight + 1 : rightHeight + 1;
    }

    // 子问题思路-求第 k 层结点个数
    int getKLevelSize(Node root,int K) {
        if(K == 1) {
            return 1;
        }
        return getKLevelSize(root.left,K-1) + getKLevelSize(root.right,K-1);
    }

    //查找val所在的节点
    Node find(Node root, int val){
        if(root == null) {
            return null;
        }
        //1、判断根节点是否是查找的数字val
        if(root.val == val) {
            return root;
        }
        //2、左边
        //  递归--》左边全部递归完成后-》返回值是否是空
        Node left = find(root.left,val);
        if(left != null) {
            return left;
        }
        //3、右边
        Node right = find(root.right,val);
        if(right != null) {
            return right;
        }
        return null;
    }

    //两棵树是否相同
    public boolean isSameTree(Node p,Node q) {
        if((p == null && q != null) || (p != null && q == null)) {
            return false;
        }
        if(p == null && q == null) {
            return true;
        }
        if(p.val != q.val) {
            return false;
        }
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }

}
