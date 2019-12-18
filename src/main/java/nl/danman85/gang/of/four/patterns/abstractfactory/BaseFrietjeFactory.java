package nl.danman85.gang.of.four.patterns.abstractfactory;

import java.util.List;

import javax.annotation.Nonnull;

import nl.danman85.gang.of.four.patterns.abstractfactory.model.FrietType;
import nl.danman85.gang.of.four.patterns.abstractfactory.model.Frietje;
import nl.danman85.gang.of.four.patterns.abstractfactory.model.SauceType;

/**
 * BaseFrietjeFactory
 */
public interface BaseFrietjeFactory {

    public abstract @Nonnull Frietje create(
        final @Nonnull FrietType frietType,
        final @Nonnull List<SauceType> sauceTypes
    );
}