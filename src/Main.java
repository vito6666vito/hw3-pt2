public class Main {
    public static void main(String[] args) {
        // Задание 1
        int clientOS = 0;
        if (clientOS == 0) {System.out.println("Установите версию приложения для iOS по ссылке");}
        if (clientOS == 1) {System.out.println("Установите версию приложения для Android по ссылке");}

        //Задание 2
        int clientOS1 = 1;
        int clientDeviceYear = 2014;
        if (clientOS1 == 0 && clientDeviceYear < 2015) {System.out.println("Установите облегченную версию приложения для iOS по ссылке");}
        else if (clientOS1 == 0 && clientDeviceYear >= 2015) {System.out.println("Установите версию приложения для iOS по ссылке");}
        if (clientOS1 == 1 && clientDeviceYear < 2015) {System.out.println("Установите облегченную версию приложения для Android по ссылке");}
        else if (clientOS1 == 1 && clientDeviceYear >= 2015) {System.out.println("Установите версию приложения для Android по ссылкее");}

        //Задание 3
        int year = 13;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
        {System.out.println( year + " год является високосным"); }
        else  {System.out.println( year + " год не является високосным");}

        //Задание 4
        int deliveryDistance = 80;
        int deliveryTime = 1;
        if (deliveryDistance >20) {deliveryTime++;}
        if (deliveryDistance >60) {deliveryTime++;}
        {System.out.println("Потребуется дней: " +deliveryTime ); }

        //Задание 5
        int monthNumber = 10;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца нет");


        }



    }
}