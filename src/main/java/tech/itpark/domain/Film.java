package tech.itpark.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data
public class Film {
    private long id;
    private String name;
    private double rating;
}
