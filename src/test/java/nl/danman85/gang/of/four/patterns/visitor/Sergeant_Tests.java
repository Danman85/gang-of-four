package nl.danman85.gang.of.four.patterns.visitor;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Sergeant_Tests
 */
public class Sergeant_Tests {

    
    private Sergeant sergeant;

    @BeforeEach
    public void setupTest() {
        this.sergeant = new Sergeant();
    }

    @AfterEach
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