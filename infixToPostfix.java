import java.util.Scanner;


public class infixToPostfix extends stackImplementation{
    public static int prec(char a){
        if (a=='*'|| a=='/'){
            return 2;
        }
        if(a=='+' || a=='-'){
            return 1;
        }
        else return 0;
    }

    public static boolean isOperator(char a){
        return (a=='+'||a=='-'||a=='*'||a=='/');
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the infix expression: ");
        String infix= sc.next();
        char[] exp= infix.toCharArray();
        String post="";
        stackImplementation st=new stackImplementation();
        for(int i=0;i<exp.length;i++){
            char c=exp[i];
            if(isOperator(c)){
                if(head==null||prec(c)>prec(peek())){
                    st.push(c);
                }else{
                    while(head!=null && prec(peek())>=prec(c) ){
                        char a= st.pop();
                        post=post+a;
                    }
                    st.push(c);
                }
              
            }
            else{
                post=post+c;
                
            }
        }
        while (head!=null) {
            post=post+pop();
        }

        System.out.println("postfix expression= "+ post);
    }
}
