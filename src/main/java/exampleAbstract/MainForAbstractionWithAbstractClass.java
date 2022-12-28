package exampleAbstract;







public class MainForAbstractionWithAbstractClass {

    public static void main(String[] args) {
        Shape s1 = new Rectangle();
        drawShape(s1);
        Shape s2 = new Square();
        drawShape(s2);
        System.out.println(s2.getDescription());
    }

    public static void drawShape(Shape s) {
        s.draw();
    }
}
