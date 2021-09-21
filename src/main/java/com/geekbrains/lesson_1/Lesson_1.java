package com.geekbrains.lesson_1;

/*  1) Создать пустой проект в IntelliJ IDEA и прописать метод main().
    2) Создать переменные всех пройденных типов данных и инициализировать их значения.
    3) Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
        где a, b, c, d – аргументы этого метода, имеющие тип float.
    4) Написать метод, принимающий на вход два целых числа и проверяющий,
        что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
    5) Написать метод, которому в качестве параметра передается целое число,
        метод должен напечатать в консоль, положительное ли число передали или отрицательное.
        Замечание: ноль считаем положительным числом.
    6) Написать метод, которому в качестве параметра передается целое число.
        Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    7) Написать метод, которому в качестве параметра передается строка, обозначающая имя.
        Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
    8) *Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
        Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
*/

public class Lesson_1 {
        // TODO: task_1
    public static void main(String[] args) {

        // TODO: task_2
        byte a = (byte) 1;
        short b = (short) 2;
        int c = 3;
        long d = 4;
        float e = 1.1f;
        double f = 1.2;
        char g = 'g';
        boolean isTrue = true;
        String s = "test";

        // TODO: task_3
        calculate(10, 15, 20, 25);

        // TODO: task_4
        checkSum(2, 18);

        // TODO: task_5
        checkPositiveNegative(0);

        // TODO: task_6
        checkNegative(-1);

        // TODO: task_7
        sayHello("Джонни");

        // TODO: task_8
        isLeapYear(2021);

    }
        //task_3
    public static float calculate (float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

        //task_4
    public static boolean checkSum(int a, int b) {
        return (a + b) > 9 && (a + b) < 21;
    }

        //task_5
    public static void checkPositiveNegative(int a) {
        System.out.println(a >= 0 ? "Положительное число" : "Отрицательное число");
    }

        //task_6
    public static boolean checkNegative(int a) {
        return a < 0;
    }

        //task_7
    public static void sayHello(String name) {
        System.out.println("Привет, " + name + "!");
    }

        //task_8
    public static void isLeapYear(int year) {
        System.out.println((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0) ? year + " год високосный" : year + " год не високосный");
    }

}