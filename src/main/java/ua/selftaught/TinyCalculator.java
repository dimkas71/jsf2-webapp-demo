package ua.selftaught;

import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named("tinyCalculator")
@SessionScoped
public class TinyCalculator implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2501705849074169929L;

	private static final Logger logger = Logger.getLogger("TinyCalculator");
	
	private double operandOne;
	private double operandTwo;
	private double result;
	
	public TinyCalculator() {
		logger.log(Level.INFO, "ctor TinyCalculator");
	}

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
		logger.info("Result of an operation is : " + result);
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
	
	public String sin() {
		result = Math.sin(operandOne);
		return "";
	}
	

}
