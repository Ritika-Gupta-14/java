public class javaji {
     static void validate(int age) {
        if (age < 18) {
            throw new ArithmeticException("you are now adult");
        } else {
            System.out.println("you are not 18 year old till now ");
        }
    }

    public static void main(String[] args) {
        try {
            validate(14);
            System.out.println("rest of the code");
        } catch (ArithmeticException e) {
            System.out.println("kuch b" + e.getMessage());
        }
    }
}