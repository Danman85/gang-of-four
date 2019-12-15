package nl.danman85.gang.of.four.patterns.visitor;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * TruckSoldierVisitor_Tests
 */
public class TruckSoldierVisitor_Tests {

    private TruckSoldierVisitor truckSoldierVisitor;

    @BeforeEach
    public void setupTest() {
        this.truckSoldierVisitor = new TruckSoldierVisitor();
    }

    @AfterEach
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