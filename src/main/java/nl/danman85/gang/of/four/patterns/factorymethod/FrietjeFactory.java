package nl.danman85.gang.of.four.patterns.factorymethod;

import javax.annotation.Nonnull;

import nl.danman85.gang.of.four.patterns.factorymethod.product.Frietje;
import nl.danman85.gang.of.four.patterns.factorymethod.product.FrietjeMet;
import nl.danman85.gang.of.four.patterns.factorymethod.product.FrietjeOorlog;
import nl.danman85.gang.of.four.patterns.factorymethod.product.FrietjeSpeciaal;

/**
 * FrietjeFactory
 */
public class FrietjeFactory implements BaseFrietjeFactory {

    @Override
    public @Nonnull Frietje fry(final @Nonnull FrietjeType type) {
        switch(type) {
            case FRIETJE_MET :
            return new FrietjeMet();
            case FRIETJE_SPECIAAL :
            return new FrietjeSpeciaal();
            case FRIETJE_OORLOG :
            return new FrietjeOorlog();
            default :
            return new Frietje() {};
        }
    }
}