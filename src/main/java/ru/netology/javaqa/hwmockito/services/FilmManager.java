package ru.netology.javaqa.hwmockito.services;
public class FilmManager {
    private String[] films = new String[0];
    private int limit;

    public FilmManager() { // конструктор без параметров с лимитом 5
        this.limit = 5;
    }

    public FilmManager(int limit) { // конструктор с параметром,
                                   // берущий значение лимита для менеджера из параметра конструктора
        this.limit = limit;
    }
    public void add(String film) { // добавление нового фильма
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public String[] findAll() { // вывод всех фильмов в порядке добавления
        return films;
    }

    public String[] findLast() {
        int resultLength;
        if (films.length < limit) {
            resultLength = films.length;
        } else {
            resultLength = limit;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;
    }
}