package nl.danman85.gang.of.four.patterns.factorymethod.product;

import javax.annotation.Nonnull;

import nl.danman85.gang.of.four.patterns.factorymethod.FrietjeType;

/**
 * Frietje
 */
public abstract class Frietje {

    protected FrietjeType type;

    public void fry() {
        System.out.println("Frying fries for 4 minutes");
    }

    public void addToppings() {
        System.out.println("Customer did not specify toppings, adding nothing.");
    }

    public Frietje() {
        this.type = FrietjeType.FRIETJE_ZONDER;
    }

    public @Nonnull FrietjeType getType() {
        return type;
    }
}