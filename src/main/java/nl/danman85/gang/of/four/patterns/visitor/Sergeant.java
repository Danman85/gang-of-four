package nl.danman85.gang.of.four.patterns.visitor;

/**
 * Sergeant
 */
public class Sergeant implements Soldier {

    @Override
    public String getRank() {
        System.out.println("Sergeant");
        return "Sergeant";
    }

    @Override
    public int getServiceNumber() {
        System.out.println("000000002");
        return 000000002;
    }

    @Override
    public boolean accept(SoldierVisitor visitor) {
        return visitor.visit(this);
    }
}