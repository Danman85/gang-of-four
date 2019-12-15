package nl.danman85.gang.of.four.patterns.visitor;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * JeepSoldierVisitor_Tests
 */
public class JeepSoldierVisitor_Tests {

    private JeepSoldierVisitor jeepSoldierVisitor;

    @BeforeEach
    public void setupTest() {
        this.jeepSoldierVisitor = new JeepSoldierVisitor();
    }

    @AfterEach
    public void tearDownTest() {
        this.jeepSoldierVisitor = null;
    }

    @Test
    public void visit_performsPrivateSpecificTask_whenPrivateIsVisited() {
        assertFalse((new Private().accept(this.jeepSoldierVisitor)));
    }

    @Test
    public void visit_performsSeargeantSpecificTask_whenSergeantIsVisited() {
        assertTrue((new Sergeant().accept(this.jeepSoldierVisitor)));
    }

    @Test
    public void visit_performsLieutenantSpecificTask_whenLieutenantIsVisited() {
        assertTrue((new Lieutenant().accept(this.jeepSoldierVisitor)));
    }
}