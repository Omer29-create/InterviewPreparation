package abstractInterface;














public class MainForAbstraction {

    public static void main(String[] args) {
        MyDriver driver = new MyChromeDriver();
        driver.getTitle();

        driver = new MyFirefoxDriver();
        driver.getTitle();
    }
}
