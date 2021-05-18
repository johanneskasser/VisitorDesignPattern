package at.ac.fhcampuswien;

public class Diesel implements Visitable{
    private double price;

    public Diesel(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
