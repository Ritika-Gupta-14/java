class ex{
    public static void main(String[] args) {
        try{
            System.out.println("1");
            System.out.println(3/0);
            System.out.println(4);
        }
    //     catch (ArithmeticException e) {
    //         System.out.println("Exception occured:----------------"+e);
    // }
    finally{
        System.out.println("finally");
    }
}}