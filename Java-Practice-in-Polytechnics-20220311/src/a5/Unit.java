package a5;

public class Unit {
	//conductors
	int unitNeedChange = 0;
	int unitChanged = 0;
	double valueNeedChange = 0.0;
	public Unit(int unitNeedChange, int unitChanged, double valueNeedChange) {
		this.unitNeedChange = unitNeedChange;
		this.unitChanged = unitChanged;
		this.valueNeedChange = valueNeedChange;
	}
	
	public double ConversionOfUnit(int unitNeedChange, int unitChanged, double valueNeedChange) {
		unitNeedChange = this.unitNeedChange;
		unitChanged = this.unitChanged;
		valueNeedChange = this.valueNeedChange;
		
		if (checkError(unitNeedChange, unitChanged) == true) { // proceed
			valueNeedChange = changeToM(unitNeedChange, valueNeedChange); // unify the unit (criteria : m)
			if (unitChanged == 1) {
				return convertTokm();
			} else if (unitChanged == 2) {
				return convertTom();
			} else if (unitChanged == 3) {
				return convertTocm();
			} else if (unitChanged == 4) {
				return convertTomm();
			} else if (unitChanged == 5) {
				return convertTomile();
			} else { // error
				System.out.println("ERROR");
				return 0;
			}
		} else { // error
			System.out.println("ERROR");
			return 0;
		}
		
		
		
	}

	public boolean checkError(int unitNeedChange, int unitChanged) {
		unitNeedChange = this.unitNeedChange;
		unitChanged = this.unitChanged;
		if (unitNeedChange == unitChanged || unitChanged < 1 || 
				unitChanged > 5 || unitNeedChange < 1 || unitNeedChange > 5) {
			return false;
		} else {
			return true;
		}
	}
	
	public double changeToM(int unitNeedChange, double valueNeedChange) { // unify the unit (criteria : m)
		unitNeedChange = this.unitNeedChange;
		valueNeedChange = this.valueNeedChange;
		switch (unitNeedChange) {
		case 1: // km
			return valueNeedChange * 1000.0;
		case 2: // m 
			return valueNeedChange;
		case 3: // cm 
			return valueNeedChange * 0.01;
		case 4: // mm 
			return valueNeedChange * 0.001;
		case 5: // mile 
			return valueNeedChange * 1609.34;
		default:
			return 0.0;
		}
	}
	
	public double convertTokm() {
		double valueConversion = changeToM(unitNeedChange, valueNeedChange);
		return valueConversion * 0.001;
	}
	
	public double convertTom() {
		double valueConversion = changeToM(unitNeedChange, valueNeedChange);
		return valueConversion;
	}
	
	public double convertTocm() {
		double valueConversion = changeToM(unitNeedChange, valueNeedChange);
		return valueConversion * 100;
	}
	
	public double convertTomm() {
		double valueConversion = changeToM(unitNeedChange, valueNeedChange);
		return valueConversion * 1000;
	}

	public double convertTomile() {
		double valueConversion = changeToM(unitNeedChange, valueNeedChange);
		return valueConversion * 0.00062;
	}
}
