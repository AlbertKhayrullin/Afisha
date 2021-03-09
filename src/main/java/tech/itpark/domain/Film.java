package tech.itpark.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data
public class Film {
    private long id;
    private String name;
    private double rating;

    public Film(int id, String name, double rating) {
        this.id = id;
        this.name = name;
        this.rating = rating;
    }
}
