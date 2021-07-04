import java.util.Arrays;

public class TypeOfValues {
    //  1. Создать репозиторий на Bitbucket и подключить к IDE. +++Используем Github
    //  2. Посчитать среднее арифметическое массива.
public static void main(String[] args) {
    //  2. Посчитать среднее арифметическое массива.
    AvgArray(new double[] {1,3,7,7,9});
    //  3. Факториал числа.
    System.out.println(getFactorial(6));
    oddOrEven(19);
    getPrice(4);
    arrayToString();
    addHello();
    getBool();
}
    // 2. Метод с помощью которого считает среднее арифметическое
private static void AvgArray(double[] mass) {
    //    int[] mass = {1,2,3,4,5,6,7,8,9};
    double avg = 0;
    for (int i = 0; i < mass.length; i++ ) {
        avg += mass[i];
    }
    avg /= mass.length;
    System.out.println("Среднее арифметическое массива:" + avg);
}

//  3. Факториал числа.
private static int getFactorial(int f) {
    int result = 1;
    for (int i = 1; i <= f; i++) {
        result *= i;
    }
    return result;
}
//  4. Вывести цену за определенный товар опираясь на его код
//     (предусмотреть возможность введение неверного кода).
// Доделать исключения
private static void getPrice(int args) {
    double[] price = {35.4,44,56,22,91};

    if (price.length < args) {
       throw new NullPointerException("Такого товара нет на складе");
    } else {
        System.out.println(price[args]);
    }
}

    //  5. Вывести на экран информацию о том является ли целое число
//     записанное в переменную n, чётным либо нечётным.
public static void oddOrEven(int number) {

    if (number != 0) {
        number %= 2;
        if (number == 0) {
            System.out.println("Even");
        } else  if (number == 1  || number == -1){
            System.out.println("Odd");
        }
    } else {
        System.out.println("Number is zero");
    }
}
//  9. Перобразовать массив в строку и обртано в массив
public static void arrayToString() {

    char[] arr = {'a','b','c','d'};
    String str = Arrays.toString(arr);
    System.out.println(str);
    char[] revArray = str.toCharArray();
    System.out.println(revArray);
}
//  10. Добавить к каждому элементу массива слова hello
public static void addHello() {
String[] someArray = {"Coco ","Mata ","Satva "};
for (int i = 0; i < someArray.length; i++){
    someArray[i] += "hello";
    System.out.println(someArray[i]);
}

}

//  11, Преобразовать числовой массив в boolean
public  static void getBool() {
    int[] a = {0, 1, 2, 3, 0};
    boolean b;
    //берем массив
    // проверяем целое, если 0 то фолс, если больше 0, то тру
    // записываем результат в консоль
    for (int i = 0; i < a.length; i++) {
        if (a[i] == 0) {
            System.out.println(b = false);
        } else {
            System.out.println(b = true);
        }
    }
}
}
