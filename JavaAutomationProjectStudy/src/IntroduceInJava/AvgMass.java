package IntroduceInJava;

public class AvgMass {

	
	public static void main(String[] args) {
		
		int[] mass = {1,2,22,4,23,24,4,8,9};
		double avg = 0;
		
		for (int i = 0; i < 9; i++ ) {
			avg += mass[i];
		}
		avg /= 9 ;
	
		System.out.println("Среднее арифметическое массива:" + avg);
		
		
	}
}
