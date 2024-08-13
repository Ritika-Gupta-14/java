public class btree{
     static class node{
        int data;
        node left;
        node right;
        node(int x){
            data=x;
            left=null;
            right=null;
        }
    }
     public static void postorder(node n){
        if(n==null){
            return;
        }
        postorder(n.left);
        postorder(n.right);
        System.out.print(n.data+ " ");
}
      
 public static void inorder(node n){
        if(n==null){
            return;
        }
        inorder(n.left);
        System.out.print(n.data+ " ");
        inorder(n.right);
}
      
    public static void preorder(node n){
        if(n==null){
            return;
        }
        System.out.print(n.data+ " ");
        preorder(n.left);
        preorder(n.right);
    }
   public static void main(String[] args) {
    node head=new node(2);
    node head2= new node(4);
    node head3= new node(12);
    head.left= head2;
    head.right=head3;
    head2.left=new node(90);
    head2.right= new node(45);
    head3.left = new node(65);
    head3.right=new node(23);
    System.out.println("preorder: ");
    preorder(head);
     System.out.println("\npostorder: ");
    postorder(head);
    System.out.println("\ninorder: ");
    inorder(head);

   }

}