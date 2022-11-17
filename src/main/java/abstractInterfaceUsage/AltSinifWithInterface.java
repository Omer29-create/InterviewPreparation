package abstractInterfaceUsage;

public class AltSinifWithInterface implements Interface3{
    @Override
    public void printContent() {

    }


    // Bu method default oldugu icin implements etmeyebiliriz
    @Override
    public void sayHello() {
        Interface3.super.sayHello();
        System.out.println("Implemented sayHello");
    }
}
