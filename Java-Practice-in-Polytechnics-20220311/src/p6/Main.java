package p6;


public class Main {

	public static void main(String[] args) {
		// P6 : Creating Game Characters 3
		Character c1 = new Character("Kin",2 ,23.3, 260);		
		

	}
	
	//inner class
	public static class Character {
		String name = "";
		int age = 0;
		double offensePower = 0.0;
		double defencePower = 0.0;

			
		public Character(final String name, final int age, final double offensePower, final double defencePower) {
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


}
