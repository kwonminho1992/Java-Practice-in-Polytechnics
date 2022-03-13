package p7;

public class Students {
	//constructor
	String name = "";
	int KoreanScore = 0;
	int EnglishScore = 0;
	int MathScore = 0;
	public Students(String name, int koreanScore, int englishScore, int mathScore) {
		this.name = name;
		this.KoreanScore = koreanScore;
		this.EnglishScore = englishScore;
		this.MathScore = mathScore;
	}
		
	public void printAll() {
		System.out.println(this.name + ", " + this.KoreanScore + ", " + this.EnglishScore + ", " + this.MathScore);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKoreanScore() {
		return KoreanScore;
	}

	public void setKoreanScore(int koreanScore) {
		KoreanScore = koreanScore;
	}

	public int getEnglishScore() {
		return EnglishScore;
	}

	public void setEnglishScore(int englishScore) {
		EnglishScore = englishScore;
	}

	public int getMathScore() {
		return MathScore;
	}

	public void setMathScore(int mathScore) {
		MathScore = mathScore;
	}

	
	
}
