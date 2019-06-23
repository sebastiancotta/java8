package br.com.java8.curso;

import java.util.Comparator;

public class Comparador implements Comparator<String> {
    @Override
    public int compare(String primeiro, String segundo) {

        if (primeiro.length() > segundo.length()){
            return 1;
        }

        if (primeiro.length() < segundo.length()) {
            return -1;
        }

        return 0;
    }
}
