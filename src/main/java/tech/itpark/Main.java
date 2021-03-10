package tech.itpark;

import tech.itpark.manager.FilmManager;
import tech.itpark.domain.Film;

public class Main {
    public static void main(String[] args) {
        FilmManager manager = new FilmManager();
        manager.add(new Film(1,"Пара из будущего",7.1, "URL изображение лайка",
                "Есть билеты","Сегодня 7 марта","URL изображения кадра"));
        manager.add(new Film(2, "Райя и последний дракон", 7.8, "URL изображение лайка",
                "Есть билеты","Сегодня 7 марта","URL изображения кадра"));
        manager.add(new Film(3, "Батя", 7.3, "URL изображение лайка",
                "Есть билеты","Сегодня 7 марта","URL изображения кадра"));
    }
}