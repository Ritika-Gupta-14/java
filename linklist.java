public class linklist {
    static class node{
        int data;
        node next;
    }
    static node head;
    static int len;
  public static void insertAtBegining(int data) 
    {
        node n= new node();
        n.data= data;
        n.next=head;
        head=n;
        len++;
        
    }
    public static void insertAtIndex(int data,int index) 
    {
        if(index>len || index<0){
            System.out.println("not possible");
            return;
        }
        if(index==0){
            insertAtBegining(data);
        }
        else if(index==len){
            insertAtLast(data);
        }
        else{
        node n= new node();
        n.data= data;
        int i=0;
        node ptr= head;
        while(i<index-1){
            ptr=ptr.next;
            i++;
        }
        n.next=ptr.next;
        ptr.next=n;
        len++;}


        }

      public static void deleteFromIndex(int index) 
    {
        if(index>len || index<0){
            System.out.println("not possible");
            return;
        }
        if(index==0){
           deleteFromFirst();
        }
        else if(index==len-1){
            deleteFromLast();
        }
        else{
       
        int i=0;
        node ptr= head;
        while(i<index-1){
            ptr=ptr.next;
            i++;
        }
        ptr.next=ptr.next.next;
       
        len--;}


        }
    
    public static void insertAtLast(int data) 
    {
        node n= new node();
        n.data= data;
        n.next=null;
        if(head==null){
            head=n;
        }else{
            node last= head;
            while(last.next!=null){
                last=last.next;
            }
            last.next=n;
        }
        len++;
    }
     public static void deleteFromLast() 
    {
        if (len<1){
            System.out.println("no element to delete");
            return;
        }
        node n=head;
        while(n.next.next!=null){
            n=n.next;
        }
        n.next=null;

        len--;
    }
     public static void deleteFromFirst() 
    {
        if (len<1){
            System.out.println("no element to delete");
            return;
        }
        ;
        head=head.next;

        len--;
    }
    public static void print(){
        if(len==0){
            System.out.println("no element in list");
            return;
        }
        node last=head;
        while (last.next!=null) {
            System.out.println(last.data);
            last=last.next;
        }
         System.out.println(last.data);
    }
     public static void search(int key){
         if(len==0){
            System.out.println("no element in list");
            return;
        }
        node last=head;
        int i=0;
        int flag=-1;
        
        while (last.next!=null) {
            if(last.data==key){ 
            System.out.println("Found element at index: "+i);
            flag++;
        }
        i++;
            last=last.next;
           
            
        }
       
        if(last.data==key){
            System.out.println("Found element at index: "+i);
            flag++;
        }
        if(flag==-1)
         System.out.println("Element not found in list");
    }
public static void main(String[] args) {
    linklist l= new linklist();
    l.insertAtLast(3);
     l.insertAtLast(4);
     l.insertAtLast(5);
    l.insertAtBegining(1);
    l.insertAtIndex(2, 81);
    l.print();
    System.out.println("length="+ len);
    deleteFromIndex(2);
    deleteFromFirst();
    deleteFromLast();
    deleteFromFirst();
    deleteFromFirst();
     l.print();
     l.search(2);
     l.search(24);
     l.search(4);
  

}
    
}
