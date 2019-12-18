package nl.danman85.gang.of.four.patterns.abstractfactory.model;

/**
 * AardappelFriet
 */
public final class AardappelFriet extends Friet {

    public AardappelFriet() {
        super.frietType = FrietType.AARDAPPEL_FRIET;
    }

    @Override
    public void fry() {
        System.out.println("Frying aardappelfriet for 5 minutes.");
    }
}