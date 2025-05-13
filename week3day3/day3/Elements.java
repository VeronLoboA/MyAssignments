package week3.day3;

public class Elements extends Button {
	public static void main(String[] args) {
		Button button = new Button();
		button.click();
		button.submit();
		
		TextField textField = new TextField();
		textField.getText();
		textField.setText("Hello");
		
		CheckBoxButton checkBoxButton = new CheckBoxButton();
		checkBoxButton.click();
		checkBoxButton.submit();
		checkBoxButton.clickCheckButton();
		
		RadioButton radioButton = new RadioButton();
		radioButton.click();
		radioButton.submit();
		radioButton.selectRadioButton();
		
		
	}

}
