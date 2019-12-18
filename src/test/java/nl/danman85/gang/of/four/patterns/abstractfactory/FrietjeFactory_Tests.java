package nl.danman85.gang.of.four.patterns.abstractfactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import nl.danman85.gang.of.four.patterns.abstractfactory.model.AardappelFriet;
import nl.danman85.gang.of.four.patterns.abstractfactory.model.FrietType;
import nl.danman85.gang.of.four.patterns.abstractfactory.model.Frietje;
import nl.danman85.gang.of.four.patterns.abstractfactory.model.Mayonaise;
import nl.danman85.gang.of.four.patterns.abstractfactory.model.SauceType;

/**
 * FrietjeFactory_Tests
 */
@ExtendWith(MockitoExtension.class)
public class FrietjeFactory_Tests {

    @Mock private FrietFactory frietFactory;
    @Mock private SauceFactory sauceFactory;    
    private BaseFrietjeFactory factory;

    @BeforeEach
    public void setupTest() {
        this.factory = new FrietjeFactory(
            this.frietFactory,
            this.sauceFactory
        );
    }

    @AfterEach
    public void teardownTest() {
        this.factory = null;
    }

    @ParameterizedTest
    @MethodSource("frietjeFactoryArgumentsSingleSauce")
    public void create_returnsAllPossibleFrietjes_withOneSauce(
        final @Nonnull FrietType frietType,
        final @Nullable List<SauceType> sauceTypes
    ) {
        when(this.frietFactory.create(any(FrietType.class))).thenReturn(new AardappelFriet());
        when(this.sauceFactory.create(any(SauceType.class))).thenReturn(new Mayonaise());
        final Frietje frietje = this.factory.create(frietType, sauceTypes);
        assertNotNull(frietje);
        assertNotNull(frietje.getFriet(), "Friet is null");
        assertNotNull(frietje.getSauces(), "Sauce list is null");
        assertEquals(1, frietje.getSauces().size(), "Sauce list is empty");
    }
    
    @ParameterizedTest
    @MethodSource("frietjeFactoryArgumentsTwoSauces")
    public void create_returnsAllPossibleFrietjes_withTwoSauces(
        final @Nonnull FrietType frietType,
        final @Nullable List<SauceType> sauceTypes
    ) {
        when(this.frietFactory.create(any(FrietType.class))).thenReturn(new AardappelFriet());
        when(this.sauceFactory.create(any(SauceType.class))).thenReturn(new Mayonaise());
        final Frietje frietje = this.factory.create(frietType, sauceTypes);
        assertNotNull(frietje);
        assertNotNull(frietje.getFriet(), "Friet is null");
        assertNotNull(frietje.getSauces(), "Sauce list is null");
        assertEquals(2, frietje.getSauces().size(), "Sauce list is empty");
    }

    private static @Nonnull Stream<Arguments> frietjeFactoryArgumentsSingleSauce() {
        return Stream.of(
            Arguments.of(FrietType.AARDAPPEL_FRIET, Arrays.asList(SauceType.MAYONAISE)),
            Arguments.of(FrietType.AARDAPPEL_FRIET, Arrays.asList(SauceType.YOPPIE)),
            Arguments.of(FrietType.AARDAPPEL_FRIET, Arrays.asList(SauceType.CURRY)),
            Arguments.of(FrietType.MEEL_FRIET, Arrays.asList(SauceType.MAYONAISE)),
            Arguments.of(FrietType.MEEL_FRIET, Arrays.asList(SauceType.YOPPIE)),
            Arguments.of(FrietType.MEEL_FRIET, Arrays.asList(SauceType.CURRY))
        );
    }

    private static @Nonnull Stream<Arguments> frietjeFactoryArgumentsTwoSauces() {
        return Stream.of(
            Arguments.of(FrietType.AARDAPPEL_FRIET, Arrays.asList(SauceType.MAYONAISE, SauceType.CURRY)),
            Arguments.of(FrietType.MEEL_FRIET, Arrays.asList(SauceType.MAYONAISE, SauceType.CURRY))
        );
    }
}