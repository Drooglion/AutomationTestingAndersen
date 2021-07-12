package H2;

import org.w3c.dom.ls.LSOutput;

public class TEST {
//1. Создать класс ТЕСТ  в нем реализовать метод
// в котором берется имя класса и добавляется параметр
//2. Создать 2 обьекта в нем вызвать этот метод
// и передать разные параметры в метод



     public String getClassName (String text) {
         System.out.print(this.getClass());
         System.out.println(text);
    return text;
    }

    public static void main(String[] args) {
        TEST test = new TEST();
        TEST test1 = new TEST();
        test.getClassName(" is First Object");
        test1.getClassName(" is Second Object");
    }
}
