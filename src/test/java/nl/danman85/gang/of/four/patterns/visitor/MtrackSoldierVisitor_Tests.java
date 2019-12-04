package nl.danman85.gang.of.four.patterns.visitor;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * MtrackSoldierVisitor_Tests
 */
public class MtrackSoldierVisitor_Tests {

    private MTrackSoldierVisitor mTrackSoldierVisitor;

    @Before
    public void setupTest() {
        this.mTrackSoldierVisitor = new MTrackSoldierVisitor();
    }

    @After
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