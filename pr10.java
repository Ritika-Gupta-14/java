class ck{
    String name;
    int age;
    ck(){
        this.name="Ritika";
        this.age=19;
    }
    ck(String a, int b){
        this.name=a;
        this.age=b;
    }
    ck(ck a){
        this.name=a.name;
        this.age=a.age;
    }

    void m(){
        System.out.println(this.name +" is "+this.age+" years old");
    }
}

public class pr10 {
    public static void main(String[] args) {
        ck a= new ck();
        ck b= new ck("Sunidhi",20);
        ck d= new ck("Nishant",19);
        ck c= new ck(d);
        a.m();
        b.m();
        c.m();
    }
    
}
 