package p3;

public class Character {
	String name = "";
	int age = 0;
	double offensePower = 0.0;
	double defencePower = 0.0;


	String ab1 = "";
	String ab2 = "";
	
	public Character(String name, int age, double offensePower, double defencePower) {
		//constructor needs parameter;
		this.name = name;
		this.age = age;
		this.offensePower = offensePower;
		this.defencePower = defencePower;
	}
	
	public Character(String ab1, String ab2) {
		this.ab1 = ab1;
		this.ab2 = ab2;
	}
	
	public void introduceCharacter() { // if protected, then this method is available in only p1 package
		System.out.println(this.name + ", " + this.age + ", " + this.offensePower + ", " + this.defencePower + this.ab1 + ", " + this.ab2);
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
