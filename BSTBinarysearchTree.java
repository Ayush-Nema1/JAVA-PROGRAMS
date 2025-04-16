public class BSTBinarysearchTree{
static class Node {
    int data ;
    Node left;
    Node right;

        public Node(int data) {
        this.data = data;
        }
    
    }
    public static Node insert(Node root,int vall){
    if(root == null){
        root = new Node(vall);
    }else if(root.data > vall){
        root.left  = insert(root.left, vall);
    }else if(root.data < vall){
        root.right = insert(root.right, vall);
    }
    return root;
    }
    public static void inorder(Node root){
      if(root == null){
        return;
      }
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        
    }
    //delete
    public static Node findnextsucessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
    public static Node delete(Node root ,int val){
       if(root.data < val){
        root.right = delete(root.right, val);
       }else if(root.data > val){
        root.left = delete(root.left, val);
       }
       else{
        //leaf 
        if(root.left == null && root.right==null){
            return null;
        }
        //one child 
        if(root.left == null){
            return root.right;
        }
        else if (root.right == null){
            return root.left;
        }
         //two children
         Node ns = findnextsucessor(root.right);
         root.data = ns.data;
         root.right = delete(root.right, ns.data); 
       }
        return root;
    }
    //printinrange
    public static void print(Node root,int k1,int k2){
        if(root == null){
            return;
        }
        if(root.data >= k1 && root.data <= k2){ 
            print(root.left,k1,k2);
            System.out.print(root.data + " ");
            print(root.right,k1,k2);
        }
        else if(k2 > root.data){
            print(root.right, k1, k2);
        }else{
            print(root.left,k1,k2);
        }
    }
    //validate bst
    public static boolean isvalid(Node root,Node min,Node max){
        if(root == null){
            return true;
        }
        if(min != null && root.data <= min.data){
            return false;
        }
        else if (max != null && root.data >= max.data){
            return false;
        }
        return isvalid(root.left, min, root) && isvalid(root.right, root, max);
    }
    //balanced binary tree for sorted array
    public static Node bst(int arr[],int st,int en){
        if(st > en){
            return null;
        }
        int mid = (st+en)/2;
        Node root = new Node(arr[mid]);
        root.left = bst(arr, st, mid-1);
        root.right = bst(arr, mid+1, en);
        return root;
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
        int val[] = {5,5,5};
        Node root = null;
          for(int i = 0;i<val.length;i++){
                root = insert(root, val[i]);
          }
     //  inorder(root);
     //  System.out.println();
     //     root =    delete(root, 5);
   //       System.out.println();
 //         inorder(root);
    //    print(root, 2, 7);    
   // System.out.println( isvalid(root, null, null));
       int arr[] = {3,5,6,8,10,11,12};
      root = bst(arr, 0, arr.length-1);
      preorder(root);
}
    
}