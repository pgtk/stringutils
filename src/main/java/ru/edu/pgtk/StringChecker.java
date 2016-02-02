package ru.edu.pgtk;

public class StringChecker {

    /**
     * Проверяет строку на пустоту. Допускается null в качестве параметра.
     *
     * @param source Строка для проверки. Допускается null
     * @return Истина, если строка равна null или пустая. Иначе - ложь.
     */
    static public boolean isEmpty(String source) {
        return source == null || source.isEmpty();
    }

    /**
     * Проверяет строку на пустоту. Допускается null в качестве параметра.
     *
     * @param source Строка для проверки. Допускается null
     * @return Истина, если строка равна null, пустая или содержит пробельные символы.
     * Иначе - ложь.
     */
    public static boolean isBlank(String source) {
        return source == null || source.trim().isEmpty();
    }

    public static boolean isNumber(String source) {
        return source.trim().matches("^[0-9]+$");
    }
}
