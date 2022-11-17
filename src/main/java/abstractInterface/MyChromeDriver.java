package abstractInterface;

public class MyChromeDriver implements MyDriver{
    @Override
    public void getTitle() {
        System.out.println("Chrome wurde hier benutzt");
    }
}
