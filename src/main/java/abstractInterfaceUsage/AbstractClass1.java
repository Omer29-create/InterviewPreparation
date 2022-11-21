package abstractInterfaceUsage;


public abstract class AbstractClass1 {
    public int a;
    int b;
    protected int c;
    private int d;
    public AbstractClass1() {

    }

    public void nonAbstractMethod() {
        System.out.println("Non Abstract Method");
    }

    public abstract void abstractMethod1();
    protected abstract int abstractmethod2(int param1);
    abstract int abstractMethod3(int param1, int param2);

    // private abstract int abstractMethod4(int param1, int param2);
    // Abstract method'lar kesinlikle private olamazlar
}
