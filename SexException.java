public class SexException extends Exception {
    public SexException() {
    }

    public void sexException(String i) {
        System.out.println("Исключение: Неверные данные в графе Пол");
        System.out.printf("Некорректные данные: %s", i);
        System.out.println();
    }
}
