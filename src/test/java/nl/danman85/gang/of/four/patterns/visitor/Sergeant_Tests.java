package nl.danman85.gang.of.four.patterns.visitor;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Sergeant_Tests
 */
public class Sergeant_Tests {

    
    private Sergeant sergeant;

    @Before
    public void setupTest() {
        this.sergeant = new Sergeant();
    }

    @After
    public void tearDownTest() {
        this.sergeant = null;
    }

    @Test
    public void private_returnsCorrectRank_whenRankIsCalledFor(){
        assertEquals("Sergeant", this.sergeant.getRank());
    }

    @Test
    public void private_returnsCorrectServiceNumber_whenCalledForIt() {
        assertEquals(000000002, this.sergeant.getServiceNumber());
    }
}