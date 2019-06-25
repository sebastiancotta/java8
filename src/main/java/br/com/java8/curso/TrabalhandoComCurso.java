package br.com.java8.curso;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TrabalhandoComCurso {

    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

//        cursos.stream().sorted(Comparator.comparingInt(Curso::getAlunos)).forEach(curso -> System.out.println(curso.getNome()));

//        cursos.stream().filter(curso -> curso.getAlunos() >= 50).forEach(curso -> System.out.println(curso.getNome()));

        cursos.stream().map(Curso::getNome).forEach(System.out::println);

        int soma = cursos.stream().filter(curso -> curso.getAlunos() > 100).mapToInt(Curso::getAlunos).sum();
        System.out.println(soma);
    }
}
