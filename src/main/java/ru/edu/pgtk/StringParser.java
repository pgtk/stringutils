package ru.edu.pgtk;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StringParser {


    public static List<String> splitIntoWords(final String source, boolean reducePunktuation) {
        final List<String> result = new ArrayList<>();
        if (null == source) {
            throw new IllegalArgumentException("Source is NULL!");
        }
        for( String word: source.split(" ")) {
            if (reducePunktuation) {
                word = word.replaceAll("\\W+", "");
            }
           if (!word.isEmpty()) {
               result.add(word);
           }
       }
        return result;
    }

    public static String joinWords(final Collection<String> words){
        if ((null == words) || words.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (String word: words) {
            if (count++ > 0) {
                sb.append(" ");
            }
            sb.append(word);
        }
        return sb.toString();
    }
}
