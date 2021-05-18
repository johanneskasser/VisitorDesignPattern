package at.ac.fhcampuswien;

public class Kerosin implements Visitable{
    private double price;

    public Kerosin(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
