package javaErrorException.HomeWork_003;

public class DataException extends Exception{
    public DataException() {
    }

    public void dataException(String i) {
        System.out.println("Исключение: Неверный формат данных");
        System.out.printf("Это неправильный формат: %s", i);
        System.out.println();
    }
}
