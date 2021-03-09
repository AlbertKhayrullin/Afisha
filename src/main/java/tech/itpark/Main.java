package tech.itpark;

import tech.itpark.Manager.FilmManager;
import tech.itpark.domain.Film;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FilmManager manager = new FilmManager();
        manager.add(new Film(1, "Пара из будущего", 7.1));
        manager.add(new Film(2, "Райя и последний дракон", 7.8));
        manager.add(new Film(3, "Батя", 7.3));
    }
}