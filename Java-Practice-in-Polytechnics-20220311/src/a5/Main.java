package a5;

public class Main {

	public static void main(String[] args) {
		// A5 : Unit Converter
		System.out.println("A5 : Unit Converter");
		
		UI ui = new UI();
		
		ui.showUnits();
		int firstUnit = ui.chooseFirstUnit();
		int secondUnit = ui.chooseSecondUnit();
		double valueNeedConvert = ui.inputValueInFirstUnit();
		
		Unit unit = new Unit(firstUnit, secondUnit, valueNeedConvert);
		double result = unit.ConversionOfUnit(firstUnit, secondUnit, valueNeedConvert);
		System.out.println("result : " + result);
	}

}
