package nl.danman85.gang.of.four.patterns.abstractfactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.annotation.Nonnull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import nl.danman85.gang.of.four.patterns.abstractfactory.model.Sauce;
import nl.danman85.gang.of.four.patterns.abstractfactory.model.SauceType;

/**
 * SauceFactory_Tests
 */
public class SauceFactory_Tests {

    private BaseSauceFactory factory;

    @BeforeEach
    public void setupTest() {
        this.factory = new SauceFactory();
    }

    @AfterEach
    public void teardownTest() {
        this.factory = null;
    }

    @ParameterizedTest
    @EnumSource(SauceType.class)
    public void create_returnsSauceOfType_whenAsked(final @Nonnull SauceType type) {
        final Sauce sauce = this.factory.create(type);
        assertNotNull(sauce);
        assertEquals(type, sauce.getType());
    }
}