package H1;

public class Cycles {
//1. Создать метод который будет работать как факториал
//2. Создать цикл с послеусловием и с перед условием
// который будет выводить число а, пока оно не станет менше 10
//3. Создать цикл forach  для массива из 10 рандомных чисел,если число равно 5 вывести в консоль

    public static void main(String[] args) {
        //1. Создать метод который будет работать как факториал
        getFactorial(8);

        //2. Создать цикл с послеусловием и с перед условием
        // который будет выводить число а, пока оно не станет менше 10
        for (int i = 15; i > 9; i--) {
            System.out.println(i);
        }

        //3. Создать цикл forach  для массива из 10 рандомных чисел,
        //   если число равно 5 вывести в консоль
        double[] randomNumbers = new double[10];
        int multiplyToInteger = 10;
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] += (int) (Math.random() * multiplyToInteger);
            if (randomNumbers[i] == 5) {
                System.out.println("Рандомная 5 выпала с " + i + " попытки");
            }
        }
    }

    public static int getFactorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }


}
