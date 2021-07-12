package H2;

public class OOP {
//    1.Создать интерфейс звери в нем создать методы рост, вес, движение, есть
//    2.Создать класс собака и  имплементировть интерфейс звери
//    3. Создать класс дог и переопределить  в нем основые методы
//    4. Перегрузить метод рост вес и движение с разыми параметрами
//       (футы,метры,метрические еденицы ...)


}

class Animal {
    private double weight;
    private double height;
    private boolean hunger;
    private int speed;

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public void setWeight(double w) {
        weight = w;
    }

    public void setHeight(double h) {
        height = h;
    }

    public void lunchTime() {
        if (hunger == false) System.out.println("");
    }
}

class Sobaka extends Animal {
}

class Dog extends Sobaka {

    private double weight;
    private double height;


    public void setWeight(double w) {
        double funts = 2.2046;
        double converting = w * 2.2046;
        weight = converting;

    }

    public void setHeight(double h) {
        double ft = 3.2808;
        double heightInFt = h * ft;
        height = heightInFt;

    }

}