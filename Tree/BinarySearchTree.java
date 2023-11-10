import java.util.ArrayList;

public class BinarySearchTree {

    Node root;

    class Node {
        int data = 0;
        Node parent;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            parent = left = right = null;
        }
    }

        private void insert(int data){

            Node newnode=new Node(data);
            if (root==null){
                root=newnode;
            }
            else{
                Node P=find(data,root);
                if(P.data>data){
                    P.left=newnode;
                    newnode.parent=P;
                }
                else if(root.data<data){
                    P.right=newnode;
                    newnode.parent=P;
                }
            }

            System.out.println("Inserted : "+newnode.data);
        }

        private Node find(int data,Node node){

                if(data==node.data){
                    return node;
                }
                else if(data<node.data){
                    if(node.left!=null){
                        return find(data,node.left);
                    }
                    return node;
                }

                else if(data>node.data){
                    if (node.right!=null){
                        return find(data,node.right);
                    }
                    return node;
                }
            return node;
    }


    private Node leftDescendent(Node node){
        if (node.left==null)
            return node;
        else{
            return leftDescendent(node.left);
        }
    }

        private Node rightAncestor(Node node){

        if(node.data<node.parent.data){
            return node.parent;
        }

        else{
            return rightAncestor(node.parent);
          }
        }

        private Node next(Node node){
            if(node.right!=null){
                return leftDescendent(node.right);
            }
            else{
                return rightAncestor(node);
            }
        }

        private void delete(int data){

            Node p= find(data,root);

            if(p.data!=data){
                System.out.println("Node is not found in the Tree: ");
            }
            else{
                if(p.right==null){
                p.parent.left=p.left;
                }
                else{
                    Node nextnode=next(p);

                    if (nextnode.right!=null){
                        p.data=nextnode.data;
                        nextnode.parent.left=nextnode.right;
                    }
                    else{
                        p.data=nextnode.data;
                        nextnode.parent.left=nextnode.left;
                    }
                }
            }
            System.out.println("Deleted : "+p.data);
        }
        private ArrayList searchRange(int x, int y){

        ArrayList<Integer> list= new ArrayList<>();
        Node node=find(x,root);

        while(node.data<=y){
            if(node.data>=x){
                list.add(node.data);
                node=next(node);
            }
        }
        return list;
    }



    public static void main(String[] args) {
        var bst= new BinarySearchTree();
        var list = new ArrayList<Integer>();

        for(int i=0; i<100; i+=5){
            bst.insert(i);
        }
//        Node n= bst.next(bst.root);
//        System.out.println("First data is : "+n.data);
//         bst.delete(n.data);
//
//        n= bst.next(bst.root);
//        System.out.println("Second Value is : "+n.data);
//
//        bst.delete(n.data);
//
//        n= bst.next(bst.root);
//        System.out.println("Second Value is : "+n.data);
        list=bst.searchRange(12,75);
        System.out.println(list);








    }
}
