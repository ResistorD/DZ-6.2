import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        System.out.println("Домашка 6.2");

        System.out.println("Задача 1");

        int year = 2021;
        checkLeapYear(year);
    }

    public static void checkLeapYear(int year) {
        if (year > 1584 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " год — високосный год.");
        } else {
            System.out.println(year + " год — невисокосный год.");
        }

        System.out.println("Задача 2");

        int clientOS = 0;
        int clientDeviceYear = 2015;
        int currentYear = LocalDate.now().getYear();

        suggestAppVersion(clientOS, clientDeviceYear, currentYear);
    }

    public static void suggestAppVersion(int clientOS, int clientDeviceYear, int currentYear) {
        if (clientDeviceYear < currentYear) {
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            }
        } else {
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке.");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке.");
            }
        }
        System.out.println("Задача 3");

        int deliveryDistance = 95;

        int deliveryDays = calculateDeliveryDays(deliveryDistance);
        System.out.println("Потребуется дней: " + deliveryDays);
    }

    public static int calculateDeliveryDays(int distance) {
        if (distance <= 20) {
            return 1;
        } else if (distance <= 60) {
            return 2;
        } else if (distance <= 100) {
            return 3;
        } else {
            return 0;
        }
    }
}