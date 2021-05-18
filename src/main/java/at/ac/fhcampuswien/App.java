package at.ac.fhcampuswien;

public class App {

    public static void main(String[] args) {
        GasTaxVisitor gasTaxVisitor = new GasTaxVisitor();

        Kerosin kerosin = new Kerosin(2.80);
        Super95 super95 = new Super95(3.90);
        Diesel diesel = new Diesel(3.00);

        System.out.println(kerosin.accept(gasTaxVisitor));
        System.out.println(super95.accept(gasTaxVisitor));
        System.out.println(diesel.accept(gasTaxVisitor));
    }
}
