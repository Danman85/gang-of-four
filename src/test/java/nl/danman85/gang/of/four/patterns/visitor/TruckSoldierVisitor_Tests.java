package nl.danman85.gang.of.four.patterns.visitor;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * TruckSoldierVisitor_Tests
 */
public class TruckSoldierVisitor_Tests {

    private TruckSoldierVisitor truckSoldierVisitor;

    @Before
    public void setupTest() {
        this.truckSoldierVisitor = new TruckSoldierVisitor();
    }

    @After
    public void tearDownTest() {
        this.truckSoldierVisitor = null;
    }

    @Test
    public void visit_performsPrivateSpecificTask_whenPrivateIsVisited() {
        assertTrue((new Private().accept(this.truckSoldierVisitor)));
    }

    @Test
    public void visit_performsSeargeantSpecificTask_whenSergeantIsVisited() {
        assertTrue((new Sergeant().accept(this.truckSoldierVisitor)));
    }

    @Test
    public void visit_performsLieutenantSpecificTask_whenLieutenantIsVisited() {
        assertFalse((new Lieutenant().accept(this.truckSoldierVisitor)));
    }
}