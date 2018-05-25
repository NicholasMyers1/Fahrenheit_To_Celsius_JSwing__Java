//import java.util.*;
import javax.swing.*;

public class FahrenheitToCelsius{

	public static void main(String[] args){
		
		String userFahrenheitInput=JOptionPane.showInputDialog(null, "Enter a fahrenheit temperature value: ");
		int fahrenheit=Integer.parseInt(userFahrenheitInput);
		
		double celsius=(fahrenheit-32)*(0.55555555555);//5/9;
		JOptionPane.showMessageDialog(null, "Your fahrenheit value is: "+fahrenheit+".\nYour celsius value is: "+celsius+".");
	}
}