package nl.danman85.gang.of.four.patterns.visitor;

/**
 * Lieutenant
 */
public class Lieutenant implements Soldier {

    @Override
    public String getRank() {
        System.out.println("Lieutenant");
        return "Lieutenant";
    }

    @Override
    public int getServiceNumber() {
        System.out.println("000000003");
        return 000000003;
    }

    @Override
    public boolean accept(SoldierVisitor visitor) {
        return visitor.visit(this);
    }

    
}