package at.ac.fhcampuswien;

import java.text.DecimalFormat;

public class GasTaxVisitor implements Visitor{
    DecimalFormat df = new DecimalFormat("#,##");

    public GasTaxVisitor() {
    }


    public double visit(Super95 super95Gallon) {
        System.out.println("Tax Price for type: Super95");
        return Double.parseDouble(df.format(super95Gallon.getPrice() * .35)) + super95Gallon.getPrice();
    }

    public double visit(Diesel dieselGallon) {
        System.out.println("Tax Price for type: Diesel");
        return Double.parseDouble(df.format(dieselGallon.getPrice() * .25)) + dieselGallon.getPrice();
    }

    public double visit(Kerosin kerosinGallon) {
        System.out.println("Tax Price for type: Kerosin");
        return Double.parseDouble(df.format(kerosinGallon.getPrice() * .15)) + kerosinGallon.getPrice();
    }
}
