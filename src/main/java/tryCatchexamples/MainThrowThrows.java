package tryCatchexamples;








import javax.xml.transform.Source;
import java.io.IOException;
import java.security.InvalidParameterException;

public class MainThrowThrows {

    public static void main(String[] args) {
        try {
            method1(10);
            method1(0);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void method1(int a) throws IOException, InvalidParameterException {
        if (a < 0) {
            throw new InvalidParameterException("a parameter should be greater than zero");
        }
        System.out.println("a = " + a);
    }
}
