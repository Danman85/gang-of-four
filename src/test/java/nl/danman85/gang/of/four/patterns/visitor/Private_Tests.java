package nl.danman85.gang.of.four.patterns.visitor;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Private_Tests
 */
public class Private_Tests {

    private Private _private;

    @BeforeEach
    public void setupTest() {
        this._private = new Private();
    }

    @AfterEach
    public void tearDownTest() {
        this._private = null;
    }

    @Test
    public void private_returnsCorrectRank_whenRankIsCalledFor(){
        assertEquals("Private", this._private.getRank());
    }

    @Test
    public void private_returnsCorrectServiceNumber_whenCalledForIt() {
        assertEquals(000000001, this._private.getServiceNumber());
    }
}