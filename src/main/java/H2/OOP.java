package H2;

public class OOP {
//    1.Создать интерфейс звери в нем создать методы рост, вес, движение, есть
//    2.Создать класс собака и  имплементировть интерфейс звери
//    3. Создать класс дог и переопределить  в нем основые методы
//    4. Перегрузить метод рост вес и движение с разыми параметрами
//       (футы,метры,метрические еденицы ...)
}
interface Animal {

    double getWeight();
    double getHeight();

    void setWeight(double w);
    void setHeight(double h);

    void lunchTime();
}

class Sobaka implements Animal {
    double weight = 0;
    double height = 0;
    boolean hunger = false;
    int speed = 0;

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

class Dog  implements Animal {

    private double weight;
    private double height;

    public double getWeight() {
        if (weight != 0) {
            return weight;
        } else {
            return -1;
        }
    }
    public double getHeight() {
        if (height != 0) {
            return height;
        } else {
            return -1;
        }
    }
    public void setWeight(double weightFunts) {
        double funts = 2.2046;
        double converting = weightFunts * 2.2046;
        weight = converting;
    }

    public void setWeight(int kilograms) {
    weight = kilograms;
    }

    public void setHeight(double h) {
        double ft = 3.2808;
        double heightInFt = h * ft;
        height = heightInFt;

    }
    public void lunchTime() {

    }

}