
import java.util.*;

public class BinaryTreeB {

    static class Node {

        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    static class BinaryTree {

        static int idx = -1;

        public static Node buildtree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newnode = new Node(nodes[idx]);
            newnode.left = buildtree(nodes);
            newnode.right = buildtree(nodes);
            return newnode;
        }

        public static void preorder(Node root) {
            //root
            //left
            //right
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        public static void inorder(Node root) {
            //left
            //root
            //right
            if (root == null) {
                return;
            }
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        public static void postorder(Node root) {
            //left // right // root
            if (root == null) {
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root + " ");
        }

        public static void levelorder(Node root) {
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node curr = q.remove();
                if (curr == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(curr.data);
                    if (curr.left != null) {
                        q.add(curr.left);
                    }
                    if (curr.right != null) {
                        q.add(curr.right);
                    }
                }
            }
        }
    }
    //Height;

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int lf = height(root.left);
        int rf = height(root.right);
        return Math.max(lf, rf) + 1;
    }
    //Diameter of tree;

    public static int diameter(Node root) {
        //o(n^2)
        if (root == null) {
            return 0;
        }
        int ld = diameter(root.left);
        int lh = height(root.left);
        int rd = diameter(root.right);
        int rh = height(root.right);
        int self = lh + rh + 1;
        return Math.max(self, Math.max(ld, rd));
    }
    //Sub tree and tree;

    public static boolean isid(Node root, Node subroot) {
        if (root == null && subroot == null) {
            return true;
        } else if (root == null || subroot == null || root.data != subroot.data) {
            return false;
        }
        if (!isid(root.left, subroot.left)) {
            return false;
        }
        if (!isid(root.right, subroot.right)) {
            return false;
        }
        return true;
    }

    public static boolean issubtree(Node root, Node subroot) {
        if (root == null) {
            return false;
        }
        if (root.data == subroot.data) {
            if (isid(root, subroot)) {
                return true;
            }
        }
        return issubtree(root.left, subroot) || issubtree(root.right, subroot);
    }
    //kth level 

    public static void klevel(Node root, int level, int k) {
        if (root == null) {
            return;
        }
        if (level == k) {
            System.out.println(root.data);
            return;
        }
        klevel(root.left, level + 1, k);
        klevel(root.right, level + 1, k);
    }
    //Last common ancestor Approach 1

    public static boolean getpath(Node root, int n, ArrayList<Node> path) {
        if (root == null) {
            return false;
        }
        path.add(root);
        if (root.data == n) {
            return true;
        }
        boolean left = getpath(root.left, n, path);
        boolean right = getpath(root.right, n, path);
        if (left || right) {
            return true;
        }
        path.remove(path.size() - 1);

        return false;
    }

    public static Node lca(Node root, int n1, int n2) {

        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();
        getpath(root, n1, path1);
        getpath(root, n2, path2);
        int i = 0;
        for (; i < path1.size() && i < path2.size(); i++) {
            if (path1.get(i) != path2.get(i)) {
                break;
            }

        }
        Node lcai = path1.get(i - 1);
        return lcai;
    }
    //Lowest commmon ancestor(Apparoach 2 )
    public static Node lca2(Node root,int n1,int n2){
  
        if(root == null ||root.data == n1 || root.data == n2){
            return root;
        }
        Node left = lca2(root.left, n1, n2);
        Node right = lca2(root.right, n1, n2);
        if(left == null){
            return right;
        }
        else if(right == null){
            return left;
        }
        return root;
    }
    //Minimum distance between nodes
    public static int mind(Node root,int n){
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
        int ld = mind(root.left, n);
        int rd = mind(root.right, n);
        if(ld == -1 && rd == -1){
            return -1;
        }
        if(ld == -1){
            return rd+1;
        }else{
           return  ld+1;
        }
    }
    public static int distance(Node root,int n1,int n2){
        Node lca = lca2(root, n1, n2);
        int lcatn1 = mind(lca,n1);
        int lcatn2 = mind(lca,n2);
        return lcatn1 + lcatn2;
    }
    //Kth Ancestor 
    public static int kthan(Node root,int n,int k){
        if(root == null){
            return -1;
        }
        if(root.data == n){
        return 0;
        }
        int ld = kthan(root.left, n, k);
        int rd = kthan(root.right, n, k);
      
        if(ld == -1 && rd ==-1){
            return -1;
        }
        int max = Math.max(ld, rd);
        if(max + 1 == k){
            System.out.println(root.data);
        }
        return max+1;
    }
    //Transform to sum tree
    public static int tsum(Node root){
        if(root == null){
            return 0;
        }
        int leftchild = tsum(root.left);
        int rightchild = tsum(root.right);

        int dataa = root.data;
        int newleft = root.left == null ? 0 : root.left.data;
        int newright = root.right == null ? 0 : root.right.data;

        root.data = newleft + leftchild + newright+rightchild;
        return dataa;  
    }
    public static void preorder(Node root){
        if(root == null){
            return ;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        // int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        //BinaryTree tree = new BinaryTree();
        //Node root = tree.buildtree(nodes);
        // System.out.println(root.data);
        // tree.preorder(root);
        // System.out.println();
        // tree.inorder(root);
        // System.out.println();
        // tree.postorder(root);
        // System.out.println();
        // tree.levelorder(root);
        // System.out.println(diameter(root));
        //       1
        //      / \
        //     2   3
        //    / \   / \
        //   4   5  6  7
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        //     Node subroot = new Node(2);
        //     subroot.left = new Node(4);
        //     subroot.right= new Node(5);
        //   System.out.println(issubtree(root, subroot));
        //klevel(root, 1, 2);
         //kthan(root, 4, 1);
         tsum(root);
         preorder(root);
    }

}
