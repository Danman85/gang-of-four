package nl.danman85.gang.of.four.patterns.abstractfactory.model;

/**
 * CurrySauce
 */
public class CurrySauce extends Sauce {

    public CurrySauce() {
        super.type = SauceType.CURRY;
    }

    @Override
    public void listIngredients() {
        System.out.println("Ingredients: sugar, spices.");
    }
}