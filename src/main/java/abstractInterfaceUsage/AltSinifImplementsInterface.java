package abstractInterfaceUsage;












public class AltSinifImplementsInterface implements Interface1, Interface2{
    @Override
    public void abstractMethod1() {
        System.out.println("Interface 1 abstract " + "method implementation");
    }

    @Override
    public void abstractMethod2() {
        System.out.println("Interface 1 abstract " + "method 2 implementation");
    }

    @Override
    public void abstractMethodOfInterface2() {
        System.out.println("Interface 2 abstract " + "method implementation");
    }
}
