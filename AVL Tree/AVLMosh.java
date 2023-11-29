public class AVLMosh {

    class Node{

        int data,height;
        Node leftchild,rightchild;

        Node(int data){
            this.data = data;
            leftchild=rightchild=null;
        }

    }
public String toString(){
        return "Root "+root.data;
}
    Node root;

    public void insert(int data){
        root=insert(data,root);
    }
    private Node insert(int data,Node root){

        if(root==null){
            return new Node(data);
        } else if (data>root.data) {
            root.rightchild=insert(data,root.rightchild);
        } else if (data< root.data) {
            root.leftchild=insert(data,root.leftchild);
        }

        root.height=Math.max(height(root.leftchild),
                height(root.rightchild))+1;

        // Checking where is it heavy
        balance(root);


        return  root;
    }

    public void balance(Node root) {
        if(isRightHeavy(root)){
            if(balancefactor(root.rightchild)>0)
                System.out.println("Right Rotate "+root.rightchild.data);

            System.out.println("Left Rotate "+root.data);
        }
        else if(isLeftHeavy(root)){
            if(balancefactor(root.leftchild)<0)
                System.out.println("Left Rotate "+root.leftchild.data);

            System.out.println("Right Rotate "+root.data);
        }

    }
    public int balancefactor(Node node){
        return (node==null) ? -1  : height(node.leftchild)-height(node.rightchild);
    }

    boolean isLeftHeavy(Node node){
        return balancefactor(node)>1;
    }
    boolean isRightHeavy(Node node){
        return balancefactor(node)<-1;
    }
    private int height(Node node){
        return (node==null) ? -1 : node.height;
    }


    public static void main(String[] args) {
        var avl=new AVLMosh();

        avl.insert(36);
        avl.insert(12);
        avl.insert(34);
     //   System.out.println(avl.toString());
        System.out.println("Done");
    }
}
