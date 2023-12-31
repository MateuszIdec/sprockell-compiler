package errors;

import org.antlr.v4.runtime.ParserRuleContext;
import code_generation.Attrs;

public class RedefinitonError extends CompilerError {

    public RedefinitonError(ParserRuleContext ctx, Attrs attrs) {
        super(ctx, attrs);
    }

    @Override
    public String getText(){
        return getErrorHeader() + "redefinition of \"" + name + "\"";
    }
}
