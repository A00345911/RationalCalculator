package model;

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
	
	public void add() {
		resultNumber=firstNumber;
		resultNumber.addRational(secondNumber);
	}
	
	public void substract() {
		resultNumber=firstNumber;
		resultNumber.substractRational(secondNumber);
	}
	
	public void multiply() {
		resultNumber=firstNumber;
		resultNumber.multiplyRational(secondNumber);
	}
	
	public void divide() {
		resultNumber=firstNumber;
		resultNumber.divideRational(secondNumber);
	}
	
	public void simplify() {}
	
	public void inverse() {
		resultNumber=firstNumber;
		resultNumber.rationalInverse();
	}
	
	public void square() {
		resultNumber=firstNumber;
		resultNumber.squaredRational();
	}

}
