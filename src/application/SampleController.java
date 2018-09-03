package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.Calculator;

public class SampleController implements Initializable{
	
	@FXML
	private Button num1;
	
	@FXML
	private Button num2;
	
	@FXML
	private Button num3;
	
	@FXML
	private Button num4;
	
	@FXML
	private Button num5;
	
	@FXML
	private Button num6;
	
	@FXML
	private Button num7;
	
	@FXML
	private Button num8;
	
	@FXML
	private Button num9;
	
	@FXML
	private Button num0;
	
	@FXML
	private Button butAdd;

	@FXML
	private Button butSubstract;
	
	@FXML
	private Button butMultiply;
	
	@FXML
	private Button butDivide;
	
	@FXML
	private Button butSimplify;
	
	@FXML
	private Button butSquare;
	
	@FXML
	private Button butInverse;
	
	@FXML
	private Button butClear;
	
	@FXML
	private Label operation;
	
	@FXML
	private TextField firstNumerator;
	
	@FXML
	private TextField firstDenominator;
	
	@FXML
	private TextField secondNumerator;
	
	@FXML
	private TextField secondDenominator;
	
	@FXML
	private TextField resultNumerator;
	
	@FXML
	private TextField resultDenominator;
	
	private Calculator calculator;
	
	public void pressOne() {
		if(firstNumerator.isFocused()) {
			firstNumerator.setText("1");
		}else if(firstDenominator.isFocused()) {
			firstDenominator.setText("1");
		}else if(secondNumerator.isFocused()) {
			secondNumerator.setText("1");
		}else if(secondDenominator.isFocused()) {
			secondDenominator.setText("1");
		}
	}
	
	public void pressTwo() {
		if(firstNumerator.isFocused()) {
			firstNumerator.setText("2");
		}else if(firstDenominator.isFocused()) {
			firstDenominator.setText("2");
		}else if(secondNumerator.isFocused()) {
			secondNumerator.setText("2");
		}else if(secondDenominator.isFocused()) {
			secondDenominator.setText("2");
		}
	}
	
	public void pressThree() {
		if(firstNumerator.isFocused()) {
			firstNumerator.setText("3");
		}else if(firstDenominator.isFocused()) {
			firstDenominator.setText("3");
		}else if(secondNumerator.isFocused()) {
			secondNumerator.setText("3");
		}else if(secondDenominator.isFocused()) {
			secondDenominator.setText("3");
		}
	}
	
	public void pressFour() {
		if(firstNumerator.isFocused()) {
			firstNumerator.setText("4");
		}else if(firstDenominator.isFocused()) {
			firstDenominator.setText("4");
		}else if(secondNumerator.isFocused()) {
			secondNumerator.setText("4");
		}else if(secondDenominator.isFocused()) {
			secondDenominator.setText("4");
		}
	}
	
	public void pressFive() {
		if(firstNumerator.isFocused()) {
			firstNumerator.setText("5");
		}else if(firstDenominator.isFocused()) {
			firstDenominator.setText("5");
		}else if(secondNumerator.isFocused()) {
			secondNumerator.setText("5");
		}else if(secondDenominator.isFocused()) {
			secondDenominator.setText("5");
		}
	}
	
	public void pressSix() {
		if(firstNumerator.isFocused()) {
			firstNumerator.setText("6");
		}else if(firstDenominator.isFocused()) {
			firstDenominator.setText("6");
		}else if(secondNumerator.isFocused()) {
			secondNumerator.setText("6");
		}else if(secondDenominator.isFocused()) {
			secondDenominator.setText("6");
		}
	}
	
	public void pressSeven() {
		if(firstNumerator.isFocused()) {
			firstNumerator.setText("7");
		}else if(firstDenominator.isFocused()) {
			firstDenominator.setText("7");
		}else if(secondNumerator.isFocused()) {
			secondNumerator.setText("7");
		}else if(secondDenominator.isFocused()) {
			secondDenominator.setText("7");
		}
	}
	
	public void pressEight() {
		if(firstNumerator.isFocused()) {
			firstNumerator.setText("8");
		}else if(firstDenominator.isFocused()) {
			firstDenominator.setText("8");
		}else if(secondNumerator.isFocused()) {
			secondNumerator.setText("8");
		}else if(secondDenominator.isFocused()) {
			secondDenominator.setText("8");
		}
	}
	
	public void pressNine() {
		if(firstNumerator.isFocused()) {
			firstNumerator.setText("9");
		}else if(firstDenominator.isFocused()) {
			firstDenominator.setText("9");
		}else if(secondNumerator.isFocused()) {
			secondNumerator.setText("9");
		}else if(secondDenominator.isFocused()) {
			secondDenominator.setText("9");
		}		
	}
	
	public void pressZero() {
		
	}
	
	public void add() {
		
		boolean fN = firstNumerator.getText().length()!=0;
		boolean fD = firstDenominator.getText().length()!=0;
		boolean sN = secondNumerator.getText().length()!=0;
		boolean sD = secondDenominator.getText().length()!=0;
		boolean rN = resultNumerator.getText().length()!=0;
		boolean rD = resultDenominator.getText().length()!=0;
		
		if(fN && fD && sN && sD && rN && rD) {
			calculator.add();
		}
		
		operation.setText("+");
	}
	
	public void substract() {
		
		boolean fN = firstNumerator.getText().length()!=0;
		boolean fD = firstDenominator.getText().length()!=0;
		boolean sN = secondNumerator.getText().length()!=0;
		boolean sD = secondDenominator.getText().length()!=0;
		boolean rN = resultNumerator.getText().length()!=0;
		boolean rD = resultDenominator.getText().length()!=0;
		
		if(fN && fD && sN && sD && rN && rD) {
			calculator.substract();
		}
		
		operation.setText("-");
	}	
	
	public void multiply() {
		
		boolean fN = firstNumerator.getText().length()!=0;
		boolean fD = firstDenominator.getText().length()!=0;
		boolean sN = secondNumerator.getText().length()!=0;
		boolean sD = secondDenominator.getText().length()!=0;
		boolean rN = resultNumerator.getText().length()!=0;
		boolean rD = resultDenominator.getText().length()!=0;
		
		if(fN && fD && sN && sD && rN && rD) {
			calculator.multiply();
		}
		
		operation.setText("x");
	}
	
	public void divide(){
		
		boolean fN = firstNumerator.getText().length()!=0;
		boolean fD = firstDenominator.getText().length()!=0;
		boolean sN = secondNumerator.getText().length()!=0;
		boolean sD = secondDenominator.getText().length()!=0;
		boolean rN = resultNumerator.getText().length()!=0;
		boolean rD = resultDenominator.getText().length()!=0;
		
		if(fN && fD && sN && sD && rN && rD) {
			calculator.divide();
		}
		
		operation.setText("÷");
	}
	
	public void inverse(){
		
		boolean fN = firstNumerator.getText().length()!=0;
		boolean fD = firstDenominator.getText().length()!=0;
		boolean rN = resultNumerator.getText().length()!=0;
		boolean rD = resultDenominator.getText().length()!=0;
		
		if(fN && fD && rN && rD) {
			calculator.inverse();
		}
		
		operation.setText("1/n");
	}
	
	public void square(){
		
		boolean fN = firstNumerator.getText().length()!=0;
		boolean fD = firstDenominator.getText().length()!=0;
		boolean rN = resultNumerator.getText().length()!=0;
		boolean rD = resultDenominator.getText().length()!=0;
		
		if(fN && fD && rN && rD) {
			calculator.square();
		}
		
		operation.setText("n²");
	}
	
	public void simplify(){
		
		boolean fN = firstNumerator.getText().length()!=0;
		boolean fD = firstDenominator.getText().length()!=0;
		boolean rN = resultNumerator.getText().length()!=0;
		boolean rD = resultDenominator.getText().length()!=0;
		
		if(fN && fD && rN && rD) {
			calculator.simplify();
		}
	}
	
	public void clearAll() {
		firstNumerator.setText("1");
		firstDenominator.setText("1");
		secondNumerator.setText("1");
		secondDenominator.setText("1");
		resultNumerator.setText("1");
		resultDenominator.setText("1");
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		firstNumerator.setText("1");
		firstDenominator.setText("1");
		secondNumerator.setText("1");
		secondDenominator.setText("1");
		resultNumerator.setText("1");
		resultNumerator.setEditable(false);
		resultDenominator.setText("1");
		resultDenominator.setEditable(false);
	}	
	
}
