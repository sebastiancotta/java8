package br.com.java8.curso;

import java.util.function.Consumer;

public class ConsumidorDeString implements Consumer<String> {
    public void accept(String s) {
        System.out.println(s);
    }
}
