package abstractInterfaceUsage;

public interface Interface3 {

    public void printContent();
    default void sayHello() {
        System.out.println("Hello");
    }
}
