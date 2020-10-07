package interface_Prac;

public class TestclasslevelEx {

	public static void main(String[] args) {
		int score=70;
		int Level;
		if(score>=90) {
			Level = 'A';
		}else if (score<90 && score>=80){
			Level='B';
		}else if(score<80 && score>=70) {
			Level='C';
		}else if (score<70 && score>=60) {
			Level='D';
		}else {
			Level='E';
		}
		System.out.printf("�o���ŶZ : %c%n", Level);

	}

}
