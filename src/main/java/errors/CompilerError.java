package errors;

import code_generation.Type;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import code_generation.Attrs;

public abstract class CompilerError {
    Integer lineNr;
    Integer columnNr;
    String name;
    Type type;

    public CompilerError(ParserRuleContext ctx, Attrs attrs){
        Token token = ctx.start;
        this.lineNr = token.getLine();
        this.columnNr = token.getCharPositionInLine();
        this.name = attrs.name;
        this.type = attrs.type;
    }
    public String getErrorHeader()
    {
        return "Error (line: "+ lineNr + ", column: "+columnNr + "): ";
    }
    public abstract String getText();
}
