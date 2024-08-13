

public class stackImplementation {
    static class node{
        char c;
        node next;
    }
    static node head=null;
    static int len=0;
    public static void push(char data){
        node n= new node();
        n.c=data;
        n.next=null;
        if(head==null){
            head=n;
       }
       else{
        node ptr=head;
        while(ptr.next!=null){
            ptr=ptr.next;
        }
        ptr.next=n;
       }
       len++;
    }

     public static char pop(){
        
        if(head==null){
            System.out.println("nothing to pop");

            return '0';
       }
       else if(head.next==null){
        node ptr=head;
        len=0;
        head=null;
        return ptr.c;
        
       }
       else{
        node ptr=head;
        while(ptr.next.next!=null){
            ptr=ptr.next;
        }
        char c= ptr.next.c;
        ptr.next=null;
        len--;
        return c;
       }


    }
    public static char peek(){
        
        if(head==null){
            System.out.println("nothing to peek");
            return '0';
       }
       else{
        node ptr=head;
        while(ptr.next!=null){
            ptr=ptr.next;
        }
        char c= ptr.c;
        return c;
       }

    }

    public static void main(String[] args) {
        stackImplementation st= new stackImplementation();
        st.push('a');
        st.push('+');
        st.push('b');
        System.out.println(st.pop());
        System.out.println(st.peek());
        
    }
    
}
