package abstractInterface;

public class MyFirefoxDriver implements MyDriver{
    @Override
    public void getTitle() {
        System.out.println("Firefox wurde hier benutzt");
    }
}
