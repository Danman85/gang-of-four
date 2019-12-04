package nl.danman85.gang.of.four.patterns.visitor;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Private_Tests
 */
public class Private_Tests {

    private Private _private;

    @Before
    public void setupTest() {
        this._private = new Private();
    }

    @After
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