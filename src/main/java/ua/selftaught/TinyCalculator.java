package ua.selftaught;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class TinyCalculator {
	
	private double operandOne;
	private double operandTwo;
	private double result;
	
	public TinyCalculator() {}

	public double getOperandOne() {
		return operandOne;
	}

	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}

	public double getOperandTwo() {
		return operandTwo;
	}

	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}
	
	public String add() {
		result = operandOne + operandTwo;
		return "";
	}
	
	public String subtract() {
		result = operandOne - operandTwo;
		return "";
	}
	

	public String multiply() {
		result = operandOne * operandTwo;
		return "";
	}
	
	public String divide() {
		result = operandOne / operandTwo;
		return "";
	}
	

}
