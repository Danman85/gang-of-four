package nl.danman85.gang.of.four.patterns.visitor;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * MtrackSoldierVisitor_Tests
 */
public class MtrackSoldierVisitor_Tests {

    private MTrackSoldierVisitor mTrackSoldierVisitor;

    @BeforeEach
    public void setupTest() {
        this.mTrackSoldierVisitor = new MTrackSoldierVisitor();
    }

    @AfterEach
    public void tearDownTest() {
        this.mTrackSoldierVisitor = null;
    }

    @Test
    public void visit_performsPrivateSpecificTask_whenPrivateIsVisited() {
        assertTrue((new Private().accept(this.mTrackSoldierVisitor)));
    }

    @Test
    public void visit_performsSeargeantSpecificTask_whenSergeantIsVisited() {
        assertTrue((new Sergeant().accept(this.mTrackSoldierVisitor)));
    }

    @Test
    public void visit_performsLieutenantSpecificTask_whenLieutenantIsVisited() {
        assertTrue((new Lieutenant().accept(this.mTrackSoldierVisitor)));
    }
}