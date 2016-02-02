package ru.edu.pgtk;

public class StringChecker {

    static public boolean isEmpty(String source) {
        return source == null || source.isEmpty();
    }

    public static boolean isBlank(String source) {
        return source == null || source.trim().isEmpty();
    }

    public static boolean isNumber(String source) {
        return source.trim().matches("^[0-9]+$");
    }
}
