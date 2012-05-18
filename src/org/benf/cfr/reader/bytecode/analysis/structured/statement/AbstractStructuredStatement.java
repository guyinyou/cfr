package org.benf.cfr.reader.bytecode.analysis.structured.statement;

import org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement;
import org.benf.cfr.reader.bytecode.analysis.structured.StructuredStatement;

/**
 * Created:
 * User: lee
 * Date: 15/05/2012
 */
public abstract class AbstractStructuredStatement implements StructuredStatement {
    Op04StructuredStatement container;

    public Op04StructuredStatement getContainer() {
        return container;
    }

    @Override
    public void setContainer(Op04StructuredStatement container) {
        this.container = container;
    }

    @Override
    public StructuredStatement claimBlock(Op04StructuredStatement innerBlock) {
        return null;
    }

    @Override
    public boolean isProperlyStructured() {
        return true;
    }
}