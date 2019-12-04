package nl.danman85.gang.of.four.patterns.visitor;

import javax.annotation.Nonnull;

/**
 * SoldierVisitor
 */
public interface SoldierVisitor {

    public boolean visit(final @Nonnull Private _private);

    public boolean visit(final @Nonnull Sergeant sergeant);
    
    public boolean visit(final @Nonnull Lieutenant lieutenant);
}