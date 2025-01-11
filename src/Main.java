import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
//Задача 1
        int year = 20;
        yearCheck(year);

//Задача 2
        int clientOS = 1;
//      int clientDeviceYear = 2015;
        int currentYear = LocalDate.now().getYear();
        checkDevice(clientOS, currentYear);
//Задача 3
        int deliveryDistance = 95;
        int days;
        days = dayDelivery(deliveryDistance);
        if (days != 0) {
            System.out.println("Потребуется дней: " + days);
        } else {
            System.out.println("Доставка не доступна");
        }
        System.out.println();
    }

    public static void checkDevice(int type, int made) {
        // Проверяем год устройства
        if (made < 2015) {
            // Первый уровень вложенности: проверяем операционную систему
            if (type == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (type == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Вы ввели некорректные данные.");
            }
        } else {
            // Первый уровень вложенности: проверяем операционную систему
            if (type == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (type == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Вы ввели некорректные данные.");
            }
        }
    }

    public static void yearCheck(int a) {
        if (a > 1584 && ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0)) {
            System.out.println(a + " год является високосным");
        } else {
            System.out.println(a + " год не является високосным");
        }
    }

    public static int dayDelivery(int deliveryDistance) {
        int deliveryDay = 0;
        if (deliveryDistance <= 20) {
            deliveryDay = 1;
        } else if (deliveryDistance <= 60) {
            deliveryDay = 2;
        } else if (deliveryDistance <= 100) {
            deliveryDay = 3;
        } else {
            deliveryDay = 0;
        }
        return deliveryDay;
    }
}
