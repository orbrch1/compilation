/* Generated By:JJTree: Do not edit this line. ASTbinaryBoolExpressionOrDef.java Version 7.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTbinaryBoolExpressionOrDef extends SimpleNode {
  public ASTbinaryBoolExpressionOrDef(int id) {
    super(id);
  }

  public ASTbinaryBoolExpressionOrDef(CLang p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(CLangVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=bd92723846f001c8f03afe170784cd78 (do not edit this line) */