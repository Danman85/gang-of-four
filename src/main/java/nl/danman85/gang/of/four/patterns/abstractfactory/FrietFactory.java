package nl.danman85.gang.of.four.patterns.abstractfactory;

import javax.annotation.Nonnull;

import nl.danman85.gang.of.four.patterns.abstractfactory.model.AardappelFriet;
import nl.danman85.gang.of.four.patterns.abstractfactory.model.Friet;
import nl.danman85.gang.of.four.patterns.abstractfactory.model.FrietType;
import nl.danman85.gang.of.four.patterns.abstractfactory.model.MeelFriet;

/**
 * FrietFactory
 */
public class FrietFactory implements BaseFrietFactory {

    @Override
    public @Nonnull Friet create(final @Nonnull FrietType type) {
        switch(type) {
            case AARDAPPEL_FRIET :
            return new AardappelFriet();
            default :
            return new MeelFriet();
        }
    }
}