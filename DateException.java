package javaErrorException.HomeWork;

public class DateException extends Exception {
    public DateException() {
    }

    public void dataException(String i) {
        System.out.println("Исключение: Неправильный формат данных");
        System.out.printf("Это неправильный формат: %s", i);
        System.out.println();
    }
}
