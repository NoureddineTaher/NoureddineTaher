package coding.open.closed.exemple;

public class Multiplication implements IOperation{
	
	  private double firstOperand;
	  private double secondOperand;
	  private double result = 0.0;
	public double getFirstOperand() {
		return firstOperand;
	}
	public void setFirstOperand(double firstOperand) {
		this.firstOperand = firstOperand;
	}
	public double getSecondOperand() {
		return secondOperand;
	}
	public void setSecondOperand(double secondOperand) {
		this.secondOperand = secondOperand;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	public Multiplication(double firstOperand, double secondOperand, double result) {
		super();
		this.firstOperand = firstOperand;
		this.secondOperand = secondOperand;
		this.result = result;
	}
	
	@Override
	public void performOperation() {
		
		// Open/closed principe
		result = firstOperand * secondOperand;
		
		
		
	}
	  
}
