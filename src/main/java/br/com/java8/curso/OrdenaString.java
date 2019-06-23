package br.com.java8.curso;

import java.util.ArrayList;
import java.util.List;

public class OrdenaString {

    public static void main(String[] args) {
        List<String> palavras = new ArrayList<String>();
        palavras.add("alura online");
        palavras.add("casa do código");
        palavras.sort((s1, s2) -> s1.length() - s2.length());
        palavras.forEach(s -> System.out.println(s));
    }

}
