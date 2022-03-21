package R2;

public class Calculation {
	// constructor
	String value = "";
	public Calculation(String value) {
		this.value = value;
	}
	
	public String[] convertIntoArrayWithUnit (String value) { // convert user's input into array (12km/h...)
		value = this.value;
		return value.split(" ");
	}
	
	public double[] extractNumbers () { // from the String array, extract numbers and convert all units into m/s
		String[] values = convertIntoArrayWithUnit(value);
		double[] valuesWithNumbers = new double[values.length];
		for (int i = 0; i < values.length; i++) {
			if (values[i].contains("m/s") && values[i].split("m/s").length == 1) { // m/s
				double n = Double.parseDouble(values[i].split("m/s")[0]);
				valuesWithNumbers[i] = n;
			} else if (values[i].contains("km/h") && values[i].split("km/h").length == 1) { // km/h
				double n = Double.parseDouble(values[i].split("km/h")[0]);
				n = 0.277778 * n; // (* 1m/s =  0.277778 km/h)
				valuesWithNumbers[i] = n;
			} else if (values[i].contains("m/ms") && values[i].split("m/ms").length == 1) { // m/ms
				double n = Double.parseDouble(values[i].split("m/ms")[0]);
				n = 1000 * n; // (* 1m/s = 1000 m/ms)
				valuesWithNumbers[i] = n;				
			} else { // make error
				double n = Double.parseDouble(values[i].split(" ")[0]);
				valuesWithNumbers[i] = n;					
			}
		}
		return valuesWithNumbers;
	}
	
	public String OptFastestOne () { // select fastest one
		String[] arrByString = convertIntoArrayWithUnit(value);
		double[] arrByDouble = extractNumbers();
		double max = arrByDouble[0];
		String maxByString = arrByString[0];
		for (int i = 0; i < arrByDouble.length; i++) {
			if (arrByDouble[i] > max) {
				max = arrByDouble[i];
				maxByString = arrByString[i];
			} else {
			}
		}
		return maxByString;
	}
}
