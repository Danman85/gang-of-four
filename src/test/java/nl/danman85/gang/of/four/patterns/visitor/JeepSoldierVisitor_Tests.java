package nl.danman85.gang.of.four.patterns.visitor;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * JeepSoldierVisitor_Tests
 */
public class JeepSoldierVisitor_Tests {

    private JeepSoldierVisitor jeepSoldierVisitor;

    @Before
    public void setupTest() {
        this.jeepSoldierVisitor = new JeepSoldierVisitor();
    }

    @After
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