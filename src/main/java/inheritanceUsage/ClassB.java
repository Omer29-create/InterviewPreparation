package inheritanceUsage;





public class ClassB extends ClassA{

    private int b;

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    @Override
    public void printContent() {
        super.printContent();
        System.out.println("b : " + b);
    }
}
