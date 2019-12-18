package nl.danman85.gang.of.four.patterns.factorymethod.product;

/**
 * FrietjeOorlog
 */
public class FrietjeOorlog extends Frietje {

    public FrietjeOorlog() {
        super.type = FrietjeType.FRIETJE_OORLOG;
    }

    @Override
    public void addToppings() {
        System.out.println("Adding: mayonaise and satesaus.");
    }
}