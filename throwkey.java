class th{

     void val(int age){
        if(age<18){
            throw new ArithmeticException("baccha bada nhi hua");
        }
        else{
            System.out.println("Badhai ho! baccha bada hua");
    }}
}

class throwkey {
public static void main(String[] args) {
    th i=new th();
    try{
    i.val(20);
    i.val(12);
}
    catch(Exception e){
        System.out.println(e);
    }
}    
}
