/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

/* Generated By:JJTree: Do not edit this line. ASTSelectIntoStatement.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */

package net.sourceforge.pmd.lang.plsql.ast;

public class ASTSelectIntoStatement extends AbstractSelectStatement {
    public ASTSelectIntoStatement(int id) {
        super(id);
    }

    public ASTSelectIntoStatement(PLSQLParser p, int id) {
        super(p, id);
    }

    @Override
    public Object jjtAccept(PLSQLParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
/*
 * JavaCC - OriginalChecksum=4c9f978ec55212d4281827784416a324 (do not edit this
 * line)
 */
