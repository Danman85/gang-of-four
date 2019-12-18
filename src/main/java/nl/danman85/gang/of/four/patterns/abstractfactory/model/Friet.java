package nl.danman85.gang.of.four.patterns.abstractfactory.model;

/**
 * Friet
 */
public abstract class Friet {

    protected FrietType frietType;

    public abstract void fry();

    public FrietType getType() {
        return this.frietType;
    }
}