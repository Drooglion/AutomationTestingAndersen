package IntroduceInJava;
//Вывести на экран информацию о том является ли целое
//число записанное в переменную n, чётным либо нечётным.
public class OddOrEven {

	public static void main(String[] args) {
		
		int number = 0;
		
		if (number != 0) {
			number %= 2;
			if (number == 0) {
				System.out.println("Even");
			} else  if (number == 1){
				System.out.println("Odd");
			} 
		} else {
			System.out.println("Number is zero"); 
		}
	}
}