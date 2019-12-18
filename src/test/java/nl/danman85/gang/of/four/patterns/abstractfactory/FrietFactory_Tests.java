package nl.danman85.gang.of.four.patterns.abstractfactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.annotation.Nonnull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import nl.danman85.gang.of.four.patterns.abstractfactory.model.Friet;
import nl.danman85.gang.of.four.patterns.abstractfactory.model.FrietType;

/**
 * FrietFactory_Tests
 */
public class FrietFactory_Tests {

    private BaseFrietFactory factory;

    @BeforeEach
    public void setupTest() {
        this.factory = new FrietFactory();
    }

    @AfterEach
    public void teardownTest() {
        this.factory = null;
    }

    @ParameterizedTest
    @EnumSource(FrietType.class)
    public void fry_returnsFrietOfType_whenAsked(final @Nonnull FrietType type) {
        final Friet friet = this.factory.create(type);
        assertNotNull(friet);
        assertEquals(type, friet.getType());
    }
}