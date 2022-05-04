package gui;

import java.util.Locale;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewController {
	
	@FXML
	private TextField txtNumero1;
	
	@FXML
	private TextField txtNumero2;
	
	@FXML
	private Label labelResult;
	
	@FXML
	private Button btSum;
	
	@FXML
	public void onBtSumAction() {
		Locale.setDefault(Locale.US);
		
		double numero1 = Double.parseDouble(txtNumero1.getText());
		double numero2 = Double.parseDouble(txtNumero2.getText());
		
		double sum = numero1 + numero2;
		
		labelResult.setText(String.format("%.2f", sum));
	}
}
