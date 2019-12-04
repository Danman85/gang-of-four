package nl.danman85.gang.of.four.patterns.visitor;

/**
 * MTrackSoldierVisitor
 */
public class MTrackSoldierVisitor implements SoldierVisitor {

    @Override
    public boolean visit(final Private _private) {
        System.out.println("Privates go in the back, nice and protected");
        return true;
    }

    @Override
    public boolean visit(final Sergeant sergeant) {
        System.out.println("Sergeants go in the back next to the door, they need to be out first to lead the Privates.");
        return true;
    }

    @Override
    public boolean visit(final Lieutenant lieutenant) {
        System.out.println("Lieutenants sit in the commander's seat.");
        return true;
    }

}