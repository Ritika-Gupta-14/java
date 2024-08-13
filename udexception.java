//similarly unchecked exceptions can be created by extending from Runtime Exception

class InvalidAgeException extends Exception{
    public InvalidAgeException( String m){
        super(m);
    }
}

class throwable{
    void val(int age) throws InvalidAgeException{
        if(age<18){
        throw new InvalidAgeException("not valid jii");}
        else{
            System.out.println("bahut badhiya valid age ");
        }

    }
}

public class udexception  {
   
    public static void main(String[] args) {
        throwable e= new throwable();
        try {
            e.val(19);
            e.val(8);
        } catch (Exception ex) {
           System.out.println(ex);
        }
        
    }
    
}
