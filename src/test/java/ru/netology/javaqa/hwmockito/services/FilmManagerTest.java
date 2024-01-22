package ru.netology.javaqa.hwmockito.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    @Test
    public void arrayFilm() { // пустой массив фильмов
        FilmManager manager = new FilmManager();

        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addOneFilm() { // добавление фильма в массив
        FilmManager manager = new FilmManager();
        manager.add("Фильм 1");

        String[] expected = {"Фильм 1"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addMoreOneFilm() {
        FilmManager manager = new FilmManager();
        manager.add("Фильм 1");
        manager.add("Фильм 2");
        manager.add("Фильм 3");

        String[] expected = {"Фильм 1", "Фильм 2", "Фильм 3"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastReverseFilmBelowLimit() { // вывод последних добавленных фильмов
        FilmManager manager = new FilmManager();
        manager.add("Фильм 1");
        manager.add("Фильм 2");
        manager.add("Фильм 3");

        String[] expected = {"Фильм 3", "Фильм 2", "Фильм 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastReverseFilm() { // вывод последних добавленных фильмов
        FilmManager manager = new FilmManager();
        manager.add("Фильм 1");
        manager.add("Фильм 2");
        manager.add("Фильм 3");
        manager.add("Фильм 4");
        manager.add("Фильм 5");

        String[] expected = {"Фильм 5", "Фильм 4", "Фильм 3", "Фильм 2", "Фильм 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastReverseFilmAboveLimit() { // вывод последних добавленных фильмов
        FilmManager manager = new FilmManager();
        manager.add("Фильм 1");
        manager.add("Фильм 2");
        manager.add("Фильм 3");
        manager.add("Фильм 4");
        manager.add("Фильм 5");
        manager.add("Фильм 6");

        String[] expected = {"Фильм 6", "Фильм 5", "Фильм 4", "Фильм 3", "Фильм 2"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}