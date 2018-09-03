package model;

import exceptions.DivisionByZeroException;
import numericSystem.*;

public class Calculator {
	
	private RationalNumber firstNumber;
	private RationalNumber secondNumber;
	private RationalNumber resultNumber;
	
	public Calculator(RationalNumber firstNumber, RationalNumber secondNumber, RationalNumber resultNumber) {
		super();
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		this.resultNumber = resultNumber;
	}

	public RationalNumber getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(RationalNumber firstNumber) {
		this.firstNumber = firstNumber;
	}

	public RationalNumber getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(RationalNumber secondNumber) {
		this.secondNumber = secondNumber;
	}

	public RationalNumber getResultNumber() {
		return resultNumber;
	}

	public void setResultNumber(RationalNumber resultNumber) {
		this.resultNumber = resultNumber;
	}
	
	public void add() throws DivisionByZeroException {
		resultNumber=firstNumber;
		resultNumber.addRational(secondNumber);
		
		if(firstNumber.getDenominator().intValue()==0 || secondNumber.getDenominator().intValue()==0) {
			new DivisionByZeroException("Dividing by zero isn't a possible operation");
		}
	}
	
	public void substract() throws DivisionByZeroException{
		resultNumber=firstNumber;
		resultNumber.substractRational(secondNumber);
		
		if(firstNumber.getDenominator().intValue()==0 || secondNumber.getDenominator().intValue()==0) {
			new DivisionByZeroException("Dividing by zero isn't a possible operation");
		}
	}
	
	public void multiply() throws DivisionByZeroException{
		resultNumber=firstNumber;
		resultNumber.multiplyRational(secondNumber);
		
		if(firstNumber.getDenominator().intValue()==0 || secondNumber.getDenominator().intValue()==0) {
			new DivisionByZeroException("Dividing by zero isn't a possible operation");
		}
	}
	
	public void divide() throws DivisionByZeroException{
		resultNumber=firstNumber;
		resultNumber.divideRational(secondNumber);
		
		if(firstNumber.getDenominator().intValue()==0 || secondNumber.getNumerator().intValue()==0) {
			new DivisionByZeroException("Dividing by zero isn't a possible operation");
		}
	}
	
	public void simplify() {}
	
	public void inverse() throws DivisionByZeroException{
		resultNumber=firstNumber;
		resultNumber.rationalInverse();
		
		if(firstNumber.getNumerator().intValue()==0) {
			new DivisionByZeroException("Dividing by zero isn't a possible operation");
		}
	}
	
	public void square() throws DivisionByZeroException{
		resultNumber=firstNumber;
		resultNumber.squaredRational();
		
		if(firstNumber.getDenominator().intValue()==0) {
			new DivisionByZeroException("Dividing by zero isn't a possible operation");
		}
	}

}
