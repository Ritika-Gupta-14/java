public class pqueue {
    
    static class node{
        int data;
        int priority;
        node next;
        public node(int a, int b){
            data=a;
            priority=b;
            next=null;

        }
    }
    static node head=null;
    static int size=0;



    public static void insert(int val, int priority){
        node n= new node(val, priority);
        if(head==null){
            head=n;
            size++;
        }
        else{
            node temp= head;
            if(temp.priority>priority){
                n.next=head;
                head=n;
                size++;
            }else{
            while(temp.next!=null && temp.next.priority<priority  ){
                temp=temp.next;

            }
            n.next=temp.next;
           temp.next=n;
            size++;
        }
        }

    }
    public static int pop(){
        node temp=head;
        if(temp.next==null){
            size--;
            head=null;
            return temp.data;

        }else{
        while(temp.next.next!= null){
            temp=temp.next;
        }
        int val=temp.next.data;
        temp.next=null;
        size--;
        return val;
    }
    }

    public static void print(){
        node temp= head;
        while(temp.next!= null){
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println(temp.data);
    }
    public static void main(String[] args) {
    pqueue q= new pqueue();
    q.insert(12, 2);
    q.insert(3, 9);
    q.insert(13, 1);
    q.insert(3, -1);
    
 int a=q.pop();
   System.out.println("popped " +a);
    q.print();
    }
    
}
