package nl.danman85.gang.of.four.patterns.factorymethod;

import javax.annotation.Nonnull;

import nl.danman85.gang.of.four.patterns.factorymethod.product.Frietje;
import nl.danman85.gang.of.four.patterns.factorymethod.product.FrietjeType;

/**
 * BaseFrietjeFactory
 */
public interface BaseFrietjeFactory {

    public @Nonnull Frietje fry(final @Nonnull FrietjeType type);
}