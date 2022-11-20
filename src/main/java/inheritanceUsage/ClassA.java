package inheritanceUsage;










public class ClassA implements ContentPrintable{

    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public void printContent() {
        System.out.println("a : " + getA());
    }
}
