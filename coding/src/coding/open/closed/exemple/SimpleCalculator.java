package coding.open.closed.exemple;

import java.security.InvalidParameterException;

public class SimpleCalculator implements ICalculator {
	/*
	 * Above module code looks good and serve the purpose. But when in client
	 * application, a developer want to add the capability of multiplication – he
	 * has no way out besides changing the SimpleCalculator class code inside method
	 * calculate(). This code is not OCP compliant.
	 */
	@Override
	public void calculate(IOperation operation) {

		if (operation == null) {
			throw new InvalidParameterException(" some message");
		}
		
		/*
		 * if (operation instanceof Addition) { Addition obj = (Addition) operation;
		 * obj.setResult(obj.getFirstOperand() + obj.getSecondOperand()); } else if
		 * (operation instanceof Substraction) {
		 * 
		 * Substraction obj = (Substraction) operation;
		 * obj.setResult(obj.getFirstOperand() - obj.getSecondOperand());
		 * 
		 * }
		 */
            
		// Open/closed principe
		operation.performOperation();
		
	}
}
