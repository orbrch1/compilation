/* Generated By:JJTree: Do not edit this line. ASTfunctionDef.java Version 7.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTfunctionDef extends SimpleNode {
  public ASTfunctionDef(int id) {
    super(id);
  }

  public ASTfunctionDef(CLang p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(CLangVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=e73964a1a597648122f34161152435d0 (do not edit this line) */