package nl.danman85.gang.of.four.patterns.visitor;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Lieutenant_Tests
 */
public class Lieutenant_Tests {

    
    private Lieutenant lieutenant;

    @Before
    public void setupTest() {
        this.lieutenant = new Lieutenant();
    }

    @After
    public void tearDownTest() {
        this.lieutenant = null;
    }

    @Test
    public void lieutenant_returnsCorrectRank_whenRankIsCalledFor(){
        assertEquals("Lieutenant", this.lieutenant.getRank());
    }

    @Test
    public void lieutenant_returnsCorrectServiceNumber_whenCalledForIt() {
        assertEquals(000000003, this.lieutenant.getServiceNumber());
    }
}