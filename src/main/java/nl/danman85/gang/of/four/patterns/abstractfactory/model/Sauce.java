package nl.danman85.gang.of.four.patterns.abstractfactory.model;

/**
 * Topping
 */
public abstract class Sauce {

    protected SauceType type;

    public abstract void listIngredients();

    public SauceType getType() {
        return this.type;
    }
}