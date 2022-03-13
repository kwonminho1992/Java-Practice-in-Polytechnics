package p2;

public class Character {
	String name = "";
	int age = 0;
	double offensePower = 0.0;
	double defencePower = 0.0;
	
	public Character() {
		this("Kim", 10, 102.4, 250.1); // this is default value
	}
	
	public Character(String name, int age, double offensePower, double defencePower) {
		//constructor needs parameter;
		this.name = name;
		this.age = age;
		this.offensePower = offensePower;
		this.defencePower = defencePower;
	}
	
	
	public void introduceCharacter() { // if protected, then this method is available in only p1 package
		System.out.println(this.name + ", " + this.age + ", " + this.offensePower + ", " + this.defencePower);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getOffensePower() {
		return offensePower;
	}

	public void setOffensePower(double offensePower) {
		this.offensePower = offensePower;
	}

	public double getDefencePower() {
		return defencePower;
	}

	public void setDefencePower(double defencePower) {
		this.defencePower = defencePower;
	}


}
