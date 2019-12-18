package nl.danman85.gang.of.four.patterns.abstractfactory;

import javax.annotation.Nonnull;

import nl.danman85.gang.of.four.patterns.abstractfactory.model.Friet;
import nl.danman85.gang.of.four.patterns.abstractfactory.model.FrietType;

/**
 * BaseFrietFactory
 */
public interface BaseFrietFactory {

    public @Nonnull Friet create(final @Nonnull FrietType type);
}