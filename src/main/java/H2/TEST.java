package H2;

public class TEST {
//1. Создать класс ТЕСТ  в нем реализовать метод
// в котором берется имя класса и добавляется параметр
//2. Создать 2 обьекта в нем вызвать этот метод
// и передать разные параметры в метод

    int someParametr;

    public static void main(String[] args) {
        TEST test = new TEST();
        TEST test1 = new TEST();
        test.someParametr = 5;
        test1.someParametr = 10;
        System.out.println(test.someParametr +" " + test1.someParametr);
    }
}
