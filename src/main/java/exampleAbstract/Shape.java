package exampleAbstract;

public abstract class Shape {

    private String description;

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    abstract void draw();
}
