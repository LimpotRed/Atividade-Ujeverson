
package com.mycompany.main;
import org.matheclipse.core.eval.ExprEvaluator;
import org.matheclipse.core.interfaces.IExpr;

/*@author lucas*/
public class Function {
    private String function;
    private ExprEvaluator evaluator;

    public Function(String function) {
        this.function = function;
        evaluator = new ExprEvaluator();
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getFunction() {
        return function;
    }

    public String calculateDerivative() {
        IExpr expr = evaluator.evaluate(function);
        return null;
    }
    
    
    
}
    