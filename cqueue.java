public class cqueue {
    static int[] arr= new int[5];
    static int front=-1;
    static int rear=-1;
    static int len=  arr.length;

    static void add(int val){
        if((rear+1)%len==front){
            System.out.println("unable to add more elements queue is full");
            return;
        }else if(front==-1 && rear==-1){
            front=0;
            rear=0;
            arr[rear]=val;
        }else{
            rear=(rear+1)%len;
            arr[rear]=val;
        }
    }
    static int del(){
         if(front==-1 && rear==-1){
            System.out.println("unable to delete element queue is empty");
            return -1;}
            else if(front==rear){
                int rval= arr[front];
                front=-1;
                rear=-1;
                return rval;
            }else{
                int rval= arr[front];
                front=(front+1)%len;
                return rval;
            }
}

public static void dis() {
       if(front==-1 && rear==-1){
            System.out.println("unable to print element queue is empty");
            return ;}
    int temp= front;
    while(temp!=rear){
        System.out.println(arr[temp]);
        temp=(temp+1)%len;
    }
    System.out.println(arr[rear]);
    
}
    public static void main(String[] args) {
        cqueue c= new cqueue();
        c.add(5);
        c.add(25);
        c.add(54);
        c.add(53);
        c.add(535);
        System.out.println("Before");
        c.dis();
        c.del();
        c.del();
        System.out.println("after deleting");
        c.dis();
        c.add(20);
        c.add(56);
        System.out.println("after adding");
        c.dis();
         c.del();
        c.del(); 
        c.del();
        c.del();
        System.out.println("jhjh");
        c.dis();
         c.del();
        c.del();
    }
    
}
