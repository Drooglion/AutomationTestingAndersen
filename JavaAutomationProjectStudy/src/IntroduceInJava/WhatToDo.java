package IntroduceInJava;


//Создать программу которае решает проблему
//Если время от 8 до 12 и денег больше 10 то идем в магазин, 
//если время больше 12 и денег больше 50 идем в кафе 
//если денег меьше 50 и время меньше 19 то идем к соседу,
//если  время больше 19 и меньше 22 то смотрим телевизор,
//если больше 22 то идем спать
//Результат выводим в консоль

public class WhatToDo {
	
	
public static void main(String[] args) {
	int time = 18;
	int money = 50;
	
	if(time >= 8 && time <= 12 && money > 10) {
		System.out.println("Идем в магазин");
	}else if (time > 12 && money > 50) {
		System.out.println("Идем в кафе");
	}  else if (time < 19 && money < 50) {
		System.out.println("Идем к соседу"); 
	} else if (time > 19 && time < 22) {
		System.out.println("Смотрим телевизор");
	} else if (time > 22) {
		System.out.println("Идем спать");
	} else {
		System.out.println("Осознаем тщетность бытия");
	}
	
	//Создать метод который будет работать как факториал 
	System.out.println(getFactorial(3));
	
//	Создать цикл foreach  
//	для массива из 10 рандомных чисел,если число равно 5 вывести в консоль
	
	double[] randomNumbers = new double[10];
	int a = 0;
	int b = 10;
	for (int i = 0; i < randomNumbers.length; i++) {
		randomNumbers[i] += a + (int)(Math.random() * b); 
		if (randomNumbers[i] == 5) {
			System.out.println("Рандомная 5 выпала с " + i + " попытки");
		}
    }
	
	// Создать цикл с послеусловием и с перед условием 
	//который будет выводить число а, пока оно не станет менше 10 
	
	for (int i= 15; i>9; i--) {
		String n = Integer.toString(i) ;
		System.out.println(n);
	}
	

}
	
private static int getFactorial(int f) {
	  int result = 1;
	  for (int i = 1; i <= f; i++) {
	     result *= i;
	  }
	  return result;
} 
}
