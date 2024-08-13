interface integer{
    void add();
    void display();
}
interface floating{
    void fadd();
    void display();
}
 class p implements integer,floating{

    

    public void add(){
        System.out.println("adding integer");

    }
    public void display(){
        System.out.println("inhereting from both integer and float ");

    }
    public void fadd(){
         System.out.println("adding float");

    }
    
}

class p3{
    public static void main(String[] args) {
        p inst= new p();
        inst.add();
        inst.display();
        inst.fadd();
    }
}
