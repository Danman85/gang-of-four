package nl.danman85.gang.of.four.patterns.abstractfactory.model;

/**
 * YoppieSauce
 */
public class YoppieSauce extends Sauce {

    public YoppieSauce() {
        super.type = SauceType.YOPPIE;
    }

    @Override
    public void listIngredients() {
        System.out.println("Ingredients: Onions, gurkins and curry powder.");
    }
}