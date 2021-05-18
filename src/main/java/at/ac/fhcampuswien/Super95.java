package at.ac.fhcampuswien;

public class Super95 implements Visitable{
    private double price;

    public Super95 (double price){
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
