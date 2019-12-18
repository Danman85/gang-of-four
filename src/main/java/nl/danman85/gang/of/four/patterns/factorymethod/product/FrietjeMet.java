package nl.danman85.gang.of.four.patterns.factorymethod.product;

/**
 * FrietjeMet
 */
public class FrietjeMet extends Frietje {

    public FrietjeMet() {
        super.type = FrietjeType.FRIETJE_MET;
    }

    @Override
    public void addToppings() {
        System.out.println("Adding mayonaise.");
    }
}