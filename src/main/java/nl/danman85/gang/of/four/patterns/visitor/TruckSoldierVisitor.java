package nl.danman85.gang.of.four.patterns.visitor;

/**
 * TruckSoldierVisitor
 */
public class TruckSoldierVisitor implements SoldierVisitor {

    @Override
    public boolean visit(final Private _private) {
        System.out.println("Plebs go in the back!");
        return true;
    }

    @Override
    public boolean visit(final Sergeant sergeant) {
        System.out.println("Sergeants can go in the passenger seat.");
        return true;
    }

    @Override
    public boolean visit(final Lieutenant lieutenant) {
        System.out.println("Lieutenants don't ride trucks.");
        return false;
    }

}