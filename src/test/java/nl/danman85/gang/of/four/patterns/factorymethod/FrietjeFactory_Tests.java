package nl.danman85.gang.of.four.patterns.factorymethod;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import nl.danman85.gang.of.four.patterns.factorymethod.product.Frietje;
import nl.danman85.gang.of.four.patterns.factorymethod.product.FrietjeType;

/**
 * FrietjeFactory_Tests
 */
public class FrietjeFactory_Tests {

    private BaseFrietjeFactory frietjeFactory;

    @BeforeEach
    public void setupTest() {
        this.frietjeFactory = new FrietjeFactory();
    }

    @AfterEach
    public void teardownTest() {
        this.frietjeFactory = null;
    }
    
    @ParameterizedTest
    @EnumSource(FrietjeType.class)
    public void fry_createsFrietjeOfTheCorrectType_whenAskedFor(FrietjeType type) {
        final Frietje frietje = this.frietjeFactory.fry(type);
        assertNotNull(frietje);
        assertEquals(type, frietje.getType());
    }
}