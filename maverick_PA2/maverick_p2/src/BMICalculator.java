package src;

import java.util.*;

public class BMICalculator {
	public String readUserData(String[] userData) {
		private int Height;
		private int Weight;
		Scanner inpt = new Scanner(System.in);
		
		System.out.printf("Enter Height then corresponding unit(in or m) followed by Weight and the corresponding unit(lbs or kgs)");
		
		int height = inpt.nextInt();
		String unit = inpt.nextLine();
		int weight = inpt.nextInt();
		String unit2 = inpt.nextLine();
		
		//read UserData that takes readUnitType and read MeasurementData methods
		//Declare private instance method called readUnitType
		private String readUnitType() {
			
		}
		//Declare private instance method for readMeasurementData that chooses readMetricData or readImperialData depending on the unit
		private int readMeasurementData() {
			
		}
		//Declare private instance method called readMetricData
		private int readMetricData() {
			
		}
		//Declare private instance method called readImperialData
		private int readImperialData() {
			
		}
		//Declare public instance method called calculateBmiCategory that determines the user's BMI category
		
}
		//Declare a public instance method called displayBmi that prints the BMI value and category to standard output
	public String displayBmi(String[] ) {
		
	}
		//Declare a public instance method called getWeight
		//Declare a public instance method called setWeight
		//Declare a public instance method called getHeight
		//Declare a public instance method called setWeight
		//Declare a public instance method called getBMI
	public String getBMI(String[]) {
		
	}
		//Declare a public instance method called getBmiCategroy
}
	public int getHeight() {
		return Height;
	}
	private void setHeight(int height) {
		Height = height;
	}
	public int getWeight() {
		return Weight;
	}
	private void setWeight(int weight) {
		Weight = weight;
	}
	        
	


