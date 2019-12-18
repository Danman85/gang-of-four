package nl.danman85.gang.of.four.patterns.abstractfactory;

import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.Nonnull;

import nl.danman85.gang.of.four.patterns.abstractfactory.model.FrietType;
import nl.danman85.gang.of.four.patterns.abstractfactory.model.Frietje;
import nl.danman85.gang.of.four.patterns.abstractfactory.model.SauceType;

/**
 * FrietjeFactory
 */
public class FrietjeFactory implements BaseFrietjeFactory {

    private final BaseFrietFactory frietFactory;
    private final BaseSauceFactory sauceFactory;

    public FrietjeFactory() {
        this.frietFactory = new FrietFactory();
        this.sauceFactory = new SauceFactory();
    }

    public FrietjeFactory(
        final @Nonnull BaseFrietFactory frietFactory,
        final @Nonnull BaseSauceFactory sauceFactory) {
            this.frietFactory = frietFactory;
            this.sauceFactory = sauceFactory;
    }

    @Override
    public @Nonnull Frietje create(final @Nonnull FrietType frietType, final @Nonnull List<SauceType> sauceTypes) {
        final Frietje frietje = new Frietje(this.frietFactory.create(frietType),
                sauceTypes.stream().map(sauceType -> this.sauceFactory.create(sauceType)).collect(Collectors.toList()));
        return frietje;
    }
}