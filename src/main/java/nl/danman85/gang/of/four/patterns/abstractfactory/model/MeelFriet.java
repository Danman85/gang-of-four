package nl.danman85.gang.of.four.patterns.abstractfactory.model;

/**
 * MeelFriet
 */
public class MeelFriet extends Friet {

    public MeelFriet() {
        super.frietType = FrietType.MEEL_FRIET;
    }

    @Override
    public void fry() {
        System.out.println("Frying meelfriet for 2 minutes.");
    }
}