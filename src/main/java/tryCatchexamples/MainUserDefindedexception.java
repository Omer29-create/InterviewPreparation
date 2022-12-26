package tryCatchexamples;


public class MainUserDefindedexception {

    public static void main(String[] args) {
        try {
            throw new UserDefinedException("This is my Exception");
        } catch (UserDefinedException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            // throw new UserDefinedException("This is my Exception"); // hata veriyor
            double a = 10 / 0;
        } finally {
            System.out.println("This is finally block");
        }
    }
}
