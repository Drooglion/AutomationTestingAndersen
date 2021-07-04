public class Operators {
    //Создать программу которае решает проблему
    //Если время от 8 до 12 и денег больше 10 то идем в магазин,
    //если время больше 12 и денег больше 50 идем в кафе
    //если денег меньше 50 и время меньше 19 то идем к соседу,
    //если  время больше 19 и меньше 22 то смотрим телевизор,
    //если больше 22 то идем спать
    //Результат выводим в консоль
    public static void main(String[] args) {
        int t = 5;
        int m = 50;
//        String action = "";
        if (t >= 8 && t <= 12 && m > 10) {
            System.out.println("Идем в магазин");
        } else if (t > 12 && m > 50) {
            System.out.println("Идем в кафе");
        } else if (t < 19 && m < 50) {
            System.out.println("Идем к соседу");
        } else if (t > 19 && t < 22) {
            System.out.println("Смотрим телевизор");
        } else if (t > 22) {
            System.out.println("Идем спать");
        } else {
            System.out.println("Осознаем тщетность бытия");
        }
        // Второе решение
        if (t >= 8 && t <= 12) {
            if (m > 10) {
                System.out.println("Идем в магазин");
            } else {
                System.out.println("Идем к соседу");
            }
        } else if (t > 12 && t < 19) {
            if (m > 50) {
                System.out.println("Идем в кафе");
            } else {
                System.out.println("Идем к соседу");
            }
        } else if (t > 19 && t < 22) {
            System.out.println("Смотрим телевизор");
        } else {
            System.out.println("Осознаем тщетность бытия");
        }
    }
}