package nl.danman85.gang.of.four.patterns.visitor;

/**
 * Private
 */
public class Private implements Soldier {

    @Override
    public String getRank() {
        System.out.println("Private");
        return "Private";
    }

    @Override
    public int getServiceNumber() {
        System.out.println("000000001");
        return 000000001;
    }

    @Override
    public boolean accept(SoldierVisitor visitor) {
        return visitor.visit(this);
    }
}