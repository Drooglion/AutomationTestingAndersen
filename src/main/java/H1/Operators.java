package H1;

public class Operators {
    //Создать программу которае решает проблему
    //Если время от 8 до 12 и денег больше 10 то идем в магазин,
    //если время больше 12 и денег больше 50 идем в кафе
    //если денег меньше 50 и время меньше 19 то идем к соседу,
    //если  время больше 19 и меньше 22 то смотрим телевизор,
    //если больше 22 то идем спать
    //Результат выводим в консоль
    public static void main(String[] args) {
        int time = 5;
        int money = 50;
//        String action = "";
        if (time >= 8 && time <= 12 && money > 10) {
            System.out.println("Идем в магазин");
        } else if (time > 12 && money > 50) {
            System.out.println("Идем в кафе");
        } else if (time < 19 && money < 50) {
            System.out.println("Идем к соседу");
        } else if (time > 19 && time < 22) {
            System.out.println("Смотрим телевизор");
        } else if (time > 22) {
            System.out.println("Идем спать");
        } else {
            System.out.println("Осознаем тщетность бытия");
        }
        // Второе решение
        if (time >= 8 && time <= 12) {
            if (money > 10) {
                System.out.println("Идем в магазин");
            } else {
                System.out.println("Идем к соседу");
            }
        } else if (time > 12 && time < 19) {
            if (money > 50) {
                System.out.println("Идем в кафе");
            } else {
                System.out.println("Идем к соседу");
            }
        } else if (time > 19 && time < 22) {
            System.out.println("Смотрим телевизор");
        } else {
            System.out.println("Осознаем тщетность бытия");
        }
    }
}