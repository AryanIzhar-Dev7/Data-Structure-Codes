public class BinaryTreeMosh {
    Node root;

    class Node {
        int data;
        Node leftChild;
        Node rightChild;

        Node(int data) {
            this.data = data;
            leftChild = null;
            rightChild = null;
        }

    }

    boolean find(int data) {

        var current= root;

        while(current!=null) {

            if (data>current.data){
                current=current.rightChild;
            }
            else if (data<current.data) {
                current=current.leftChild;
            }
            else{
                return true;
            }

        }

    return  false;}

    void preordertraverse(Node root){

        if(root==null){
            return;
        }
        System.out.print(root.data+", ");
        preordertraverse(root.leftChild);
        preordertraverse(root.rightChild);
    }
    void inordertraverse(Node root){

        if(root==null){
            return;
        }
        inordertraverse(root.leftChild);
        System.out.print(root.data+", ");
        inordertraverse(root.rightChild);
    }
    void postordertraverse(Node root){

        if(root==null){
            return;
        }
        postordertraverse(root.leftChild);
        postordertraverse(root.rightChild);
        System.out.print(root.data+", ");

    }


    void insert(int data){
        var node= new Node(data);

        if(root==null){
            root=node;
            return;
        }

        var current= root;

        while (true) {

             if(current.data>data){
                if(current.leftChild==null){
                    current.leftChild=node;
                    break;
                }
                current=current.leftChild;
            }

            else if(current.data<data){
                if(current.rightChild==null){
                    current.rightChild=node;
                    break;
                }
                current=current.rightChild;
            }
        }

    }

    int height(Node root){
        if (root==null)
            return -1;

        if (root.leftChild==null && root.rightChild==null){
            return 0;
        }

        return 1+ Math.max(height(root.leftChild), height(root.rightChild));
    }

    public static void main(String[] args) {
        var tree= new BinaryTreeMosh();

        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(6);
        tree.insert(8);
        tree.insert(10);




        boolean result=tree.find(88);

        System.out.println(result);


        System.out.println("**************************Preorder****************");
        tree.preordertraverse(tree.root);
        System.out.println();
        System.out.println("**************************Inorder****************");
        tree.inordertraverse(tree.root);
        System.out.println();
        System.out.println("**************************Postorder****************");
        tree.postordertraverse(tree.root);
        System.out.println();

        System.out.println("Height of the Tree is  : "+tree.height(tree.root));
        System.out.println("Done!");


    }
}
