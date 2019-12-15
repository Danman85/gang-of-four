package nl.danman85.gang.of.four.patterns.visitor;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Lieutenant_Tests
 */
public class Lieutenant_Tests {

    private Lieutenant lieutenant;

    @BeforeEach
    public void setupTest() {
        this.lieutenant = new Lieutenant();
    }

    @AfterEach
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