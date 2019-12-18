package nl.danman85.gang.of.four.patterns.abstractfactory;

import javax.annotation.Nonnull;

import nl.danman85.gang.of.four.patterns.abstractfactory.model.Sauce;
import nl.danman85.gang.of.four.patterns.abstractfactory.model.SauceType;

/**
 * BaseSauceFactory
 */
public interface BaseSauceFactory {

    public @Nonnull Sauce create(final @Nonnull SauceType type);
}