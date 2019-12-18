package nl.danman85.gang.of.four.patterns.abstractfactory;

import javax.annotation.Nonnull;

import nl.danman85.gang.of.four.patterns.abstractfactory.model.CurrySauce;
import nl.danman85.gang.of.four.patterns.abstractfactory.model.Mayonaise;
import nl.danman85.gang.of.four.patterns.abstractfactory.model.Sauce;
import nl.danman85.gang.of.four.patterns.abstractfactory.model.SauceType;
import nl.danman85.gang.of.four.patterns.abstractfactory.model.YoppieSauce;

/**
 * BaseSauceFactory
 */
public class SauceFactory implements BaseSauceFactory {

    public Sauce create(final @Nonnull SauceType type) {
        switch (type) {
            case CURRY :
            return new CurrySauce();
            case YOPPIE :
            return new YoppieSauce();
            default:
            return new Mayonaise();
        }
    }
}