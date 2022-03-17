package lecture;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.ArrayList;

public class DataRefining {

	public static void main(String[] args) {
		// find mean, amx, min of all district in Seoul
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\kwonminho.DESKTOP-1VD3F43\\Desktop\\lecture\\Java\\도시지역_인구현황_시군구__20220317140109.csv"));
			ArrayList<Integer> populations = new ArrayList<Integer>();
			ArrayList<String> districts = new ArrayList<String>();
			ArrayList<String> districtsWithPopulation = new ArrayList<String>();
			String line;
			String region = "경상북도";
			while ((line = br.readLine()) != null) {
				if (line.split(",")[0].contains(region) && !line.split(",")[1].contains("소계")) {
					populations.add(Integer.parseInt(line.split(",")[2]));	
					districts.add(line.split(",")[1]);
					districtsWithPopulation.add(line.split(",")[1] + line.split(",")[2]);
				} else {
				}
			}
			//calculate mean, min, max
			double mean = 0;
			int min = populations.get(0);
			int max = populations.get(0);
			String minRegion = "";
			String maxRegion = "";
			for (int i = 0; i < populations.size(); i++) {
				mean = mean + populations.get(i); // mean
				if (populations.get(i) < min) { // min
					min = populations.get(i);
				} else {
				}
				if (populations.get(i) > max) { // max
					max = populations.get(i);
				} else {
				}
			}
			mean = mean / districts.size();
			
			// find min region & max region
			for (int i = 0; i < districtsWithPopulation.size(); i++) {
				if (districtsWithPopulation.get(i).contains(Integer.toString(min))) {
					minRegion = districts.get(i);
				} else {
				}
				if (districtsWithPopulation.get(i).contains(Integer.toString(max))) {
					maxRegion = districts.get(i);
				} else {
				}
			}
			
			//add comma to values
			String meanPrint = NumberFormat.getInstance().format(mean);
			String minPrint = NumberFormat.getInstance().format(min);
			String maxPrint = NumberFormat.getInstance().format(max);
			System.out.println("Population calculating - " + region);
			System.out.println(districts.size() + " - " + districts + "\n" + populations +
					"\nmean : " + meanPrint + " / min : " + minPrint + "(" + minRegion + ")" + 
					" / max : " + maxPrint+ "(" + maxRegion + ")");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}	
}
