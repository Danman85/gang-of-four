package nl.danman85.gang.of.four.patterns.visitor;

import javax.annotation.Nonnull;

/**
 * Soldier
 */
public interface Soldier {

    @Nonnull
    public String getRank();

    @Nonnull
    public int getServiceNumber();

    public boolean accept(final @Nonnull SoldierVisitor soldierVisitor);
}