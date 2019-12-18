package nl.danman85.gang.of.four.patterns.factorymethod.product;

/**
 * FrietjeSpeciaal
 */
public class FrietjeSpeciaal extends Frietje{

    public FrietjeSpeciaal() {
        super.type = FrietjeType.FRIETJE_SPECIAAL;
    }

    @Override
    public void addToppings() {
        System.out.println("Adding: mayonaise, curry, chopped onions.");
    }
}