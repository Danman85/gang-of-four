package nl.danman85.gang.of.four.patterns.abstractfactory.model;

/**
 * Mayonaise
 */
public class Mayonaise extends Sauce{

    public Mayonaise() {
        super.type = SauceType.MAYONAISE;
    }

    @Override
    public void listIngredients() {
        System.out.println("Ingredients: oil, vinegar and egg yolk.");
    }
}