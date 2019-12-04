package nl.danman85.gang.of.four.patterns.visitor;

/**
 * JeepSoldierVisitor
 */
public class JeepSoldierVisitor implements SoldierVisitor {

    @Override
    public boolean visit(final Private _private) {
        System.out.println("There is no room in a Jeep for riff raff, a private can walk");
        return false;
    }

    @Override
    public boolean visit(final Sergeant sergeant) {
        System.out.println("Sergeants are excellent drivers, behind the steering wheel with you!");
        return true;
    }

    @Override
    public boolean visit(final Lieutenant lieutenant) {
        System.out.println("Officers don't drive, passenger seat it is... with a glass of wine!");
        return true;
    }

}